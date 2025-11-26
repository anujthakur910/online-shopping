package com.example.shop;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract double getDiscount();

    public double finalPrice(){
        return price - getDiscount();
    }

    public void display(){
        System.out.println(name + " - Rs." + price + " | Discount: " + getDiscount());
    }
}
