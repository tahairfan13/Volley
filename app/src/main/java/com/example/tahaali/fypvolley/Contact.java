package com.example.tahaali.fypvolley;

/**
 * Created by hp on 8/8/2017.
 */

public class Contact {

    private String name;
    private String Email;

    public Contact(String name, String email) {
        this.name = name;
        this.Email=email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }




}
