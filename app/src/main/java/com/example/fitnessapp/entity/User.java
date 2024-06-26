package com.example.fitnessapp.entity;

public class User {

    private String username;
    private String password;
    private String email;
    private String type;

    public User() {

    }

    public User(String username, String password, String email, String type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = "user";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
