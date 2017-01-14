package com.app.maffan.androidtraining.network.ResponseModels;


import com.google.gson.annotations.SerializedName;

public class User {


    @SerializedName("gender")
    private String gender;

    @SerializedName("name")
    private Name name;

    @SerializedName("location")
    private Location location;

    @SerializedName("email")
    private String email;

    @SerializedName("dob")
    private String dob;

    @SerializedName("registered")
    private String registered;

    @SerializedName("phone")
    private String phone;

    @SerializedName("cell")
    private String cell;

    @SerializedName("picture")
    private Picture picture;


    public User(String gender, Name name, Location location, String email, String dob, String registered, String phone, String cell, Picture picture) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.picture = picture;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
