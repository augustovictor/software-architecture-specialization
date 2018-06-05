package com.example.sharingapp;

import java.util.Random;

/**
 * Created by victoraweb on 17/03/18.
 */

class Contact {
    private String username;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        this.id = new Random().toString();
        this.username = username;
        this.email = email;
    }

    public Contact() {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
