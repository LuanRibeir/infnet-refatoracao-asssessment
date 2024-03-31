public class Person {
    private String name;
    private Address address;
    private Phone OfficeNumber;

    public Person(String name, String officeAreaCode, String officeNumber, String street, String city, String state,
            String zip) {
        this.name = name;
        this.address = new Address(street, city, state, zip);
        this.officePhone = new Phone(officeAreaCode, officeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(Phone officePhone) {
        this.officePhone = officePhone;
    }

    @Override
    public String toString() {
        return name + " " + address.getStreet() + " " + address.getCity() + " " + address.getState() + " " +
                address.getZip() + " " + officePhone.getFormattedNumber();
    }
}
