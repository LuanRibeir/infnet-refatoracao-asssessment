public class Phone {
    private String officeAreaCode;
    private String officeNumber;

    public Phone(String areaCode, String number) {
        this.officeAreaCode = areaCode;
        this.officeNumber = number;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFormattedNumber() {
        return "(" + officeAreaCode + ") " + officeNumber;
    }

}
