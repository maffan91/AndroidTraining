package com.app.maffan.androidtraining.network.ResponseModels;



public class Location {

    private String street;
    private String city;
    private String state;
    private int postCode;

    public Location(String street, String city, String state, int postCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}
