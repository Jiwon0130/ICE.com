package com.example.finalproject;

public class ICEInfo {
    String desc, phone, email, address;

    public ICEInfo(String desc, String ph, String email, String addr) {
        this.desc = desc;
        this.phone = ph;
        this.email = email;
        this.address = addr;
    }

    public String getDesc() { return desc; }

    public String getPhone() { return phone; }

    public String getEmail() { return email; }

    public String getAddress() { return address; }

}
