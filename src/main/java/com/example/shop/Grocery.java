package com.example.shop;

public class Grocery extends Product {

    public Grocery(String name, double price){
        super(name, price);
    }

    @Override
    public double getDiscount(){
        return price * 0.05;
    }
}
