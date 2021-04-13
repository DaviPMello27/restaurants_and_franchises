package com.example.entities;

public class Restaurant {
    public String name;
    public String address;
    public String city;
    public int image;

    public Restaurant(
            String name,
            String address,
            String city,
            int image
    ){
        this.name = name;
        this.address = address;
        this.city = city;
        this.image = image;
    }
}
