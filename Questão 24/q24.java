public class q24 {
    private int _height;
    private int _width;

    void setHeight(int value) {
        _height = value;
    }

    void setWidth(int value) {
        _width = value;
    }

    void setValue(String name, int value) {
        if (name.equals("height")) {
            setHeight(value);
            return;
        }
        if (name.equals("width")) {
            setWidth(value);
            return;
        }
        Assert.shouldNeverReachHere();
    }
}
