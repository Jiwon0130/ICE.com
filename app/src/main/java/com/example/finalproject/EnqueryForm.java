package com.example.finalproject;

public class EnqueryForm {

    String name, email, detail, button;

    public EnqueryForm(String name, String email, String detail, String bt) {
        this.name = name;
        this.email = email;
        this.detail = detail;
        this.button = bt;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getDetail() { return detail; }

    public String getButtonText() { return button; }

}
