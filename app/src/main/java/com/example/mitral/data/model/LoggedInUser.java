package com.example.mitral.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String userFullName;
    private String userEmail;
    private int age;
    private String gender="";
    private String zipcode="00000";
    private String city = "";

    public LoggedInUser(String userId, String userFullName) {
        this.userId = userId;
        this.userFullName = userFullName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }
}
