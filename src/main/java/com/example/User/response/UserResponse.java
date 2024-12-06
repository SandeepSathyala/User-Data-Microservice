package com.example.User.response;

public class UserResponse {
    private String name;
    private String username;
    private String email;
    private String lat;
    private String lng;

    public UserResponse(String name, String username, String email, String lat, String lng) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.lat = lat;
        this.lng = lng;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
