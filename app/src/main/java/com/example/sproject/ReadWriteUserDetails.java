package com.example.sproject;

public class ReadWriteUserDetails {

    public String name,phone ,uaddress ,Id;

    public ReadWriteUserDetails(){};
    public ReadWriteUserDetails(String username, String mobilenumber, String address,String Id){
        this.name=username;
        this.phone=mobilenumber;
        this.uaddress=address;
        this.Id=Id;
    }
}
