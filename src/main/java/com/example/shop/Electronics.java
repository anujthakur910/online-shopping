package com.example.shop;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths){
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscount(){
        return price * 0.10; // 10% discount
    }
}
