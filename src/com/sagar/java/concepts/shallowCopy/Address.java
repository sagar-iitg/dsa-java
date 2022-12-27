package com.sagar.java.concepts.shallowCopy;

public class Address {

    //private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    public Address ()
    {

        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
    }
    public Address (String streetAddr, String city,
                    String state, String zip)
    {

        this.streetAddress = streetAddr;
        this.city = city;
        this.state = state;
        this.zipCode = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: \n{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
