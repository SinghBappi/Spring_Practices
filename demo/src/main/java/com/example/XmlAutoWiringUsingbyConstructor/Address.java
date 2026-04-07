package com.example.XmlAutoWiringUsingbyConstructor;

public class Address {
    private int houseno;
    private String city;
    private int pincode;

    public Address(String city, int houseno, int pincode) {
        this.city = city;
        this.houseno = houseno;
        this.pincode = pincode;
    }

    

    @Override
    public String toString() {
        return "# "+ houseno+ " "+ " City: "+city+" "+ " Pincode: "+ pincode;
    }
    
}
