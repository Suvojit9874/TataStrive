package TataStrive.Classwork.Aggregation;


public class Address {
    int pincode;
    String city,country,state;
    public Address(int pincode, String city, String country, String state) {
        super();
        this.pincode = pincode;
        this.city = city;
        this.country = country;
        this.state = state;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

}

