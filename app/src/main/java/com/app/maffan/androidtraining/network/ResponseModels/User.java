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

    public class Name {

        @SerializedName("title")
        private String title;

        @SerializedName("first")
        private String first;

        @SerializedName("last")
        private String last;

        public Name(String title, String first, String last) {
            this.title = title;
            this.first = first;
            this.last = last;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        @Override
        public String toString() {

            return this.title + ' ' + this.first + ' ' + this.last;

        }
    }


    public class Location {

        @SerializedName("street")
        private String street;

        @SerializedName("city")
        private String city;

        @SerializedName("state")
        private String state;

        @SerializedName("postCode")
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

        @Override
        public String toString() {
            return this.street + ',' + this.city;
        }
    }


    public class Picture {

        @SerializedName("large")
        private String large;

        @SerializedName("medium")
        private String medium;

        @SerializedName("thumbnail")
        private String thumbnail;

        public Picture(String large, String medium, String thumbnail) {
            this.large = large;
            this.medium = medium;
            this.thumbnail = thumbnail;
        }


        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }





}
