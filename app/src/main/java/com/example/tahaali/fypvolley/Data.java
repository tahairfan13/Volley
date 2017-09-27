package com.example.tahaali.fypvolley;

/**
 * Created by hp on 8/9/2017.
 */

public class Data
{
    private int placeId;
    private int categoryId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String webAddress;
    private float geolongitude;
    private float geolatutute;
    private String type; //CHECK
    private String tags;
    private String DateAdded;

    public Data()
    {
        placeId=1;
        categoryId=1;
        name="Default";
        address="Default";
        phoneNumber="Default";
        email="...@hotmail.com";
        webAddress="default";
        geolatutute=0;
        geolongitude=0;
        type="Default";
        tags="Default";
        DateAdded="Default";

    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public float getGeolongitude() {
        return geolongitude;
    }

    public void setGeolongitude(float geolongitude) {
        this.geolongitude = geolongitude;
    }

    public float getGeolatutute() {
        return geolatutute;
    }

    public void setGeolatutute(float geolatutute) {
        this.geolatutute = geolatutute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(String dateAdded) {
        DateAdded = dateAdded;
    }
}
