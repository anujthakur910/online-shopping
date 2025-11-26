package com.example.shop;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size){
        super(name, price);
        this.size = size;
    }

    @Override
    public double getDiscount(){
        return price * 0.20;
    }
}
