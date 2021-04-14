package cz.czechitas.java2webapps.lekce3.entity;

public class Address {

    private String streetWithNumber;
    private String city;
    private String zipCode;

    public Address(String streetWithNumber, String city, String zipCode) {
        this.streetWithNumber = streetWithNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreetWithNumber() {
        return streetWithNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}
