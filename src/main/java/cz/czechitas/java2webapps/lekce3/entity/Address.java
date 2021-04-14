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

    public void setStreetWithNumber(String streetWithNumber) {
        this.streetWithNumber = streetWithNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
