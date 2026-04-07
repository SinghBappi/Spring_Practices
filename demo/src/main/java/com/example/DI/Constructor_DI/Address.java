package com.example.DI.Constructor_DI;


public class Address {
    private int houseno;
    private String city;
    private int pincode;

    

    // public int getHouseno() {
    //     return houseno;
    // }

    // public String getCity() {
    //     return city;
    // }

    // public int getPincode() {
    //     return pincode;
    // }

    // public void setHouseno(int houseno) {
    //     this.houseno = houseno;
    // }

    // public void setCity(String city) {
    //     this.city = city;
    // }

    // public void setPincode(int pincode) {
    //     this.pincode = pincode;
    // }

    public Address(int houseno, String city, int pincode) {
        this.houseno = houseno;
        this.city = city;
        this.pincode = pincode;
    }



    @Override
    public String toString() {
        // return super.toString();
        return " Home: "+houseno+" City: "+city+" PinCode: " + pincode;
    }

    // public Address(String city, int houseno, int pincode) {
    //     this.city = city;
    //     this.houseno = houseno;
    //     this.pincode = pincode;
    // }
    
    
}
