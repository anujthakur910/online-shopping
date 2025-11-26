package com.example.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> cart = new ArrayList<>();

        cart.add(new Electronics("Smartphone", 20000, 24));
        cart.add(new Clothing("T-Shirt", 1500, "L"));
        cart.add(new Grocery("Rice (5kg)", 2500));

        double total = 0;
        System.out.println("Cart items:");
        for(Product p : cart){
            p.display();
            total += p.finalPrice();
        }

        System.out.println("----------------------------");
        System.out.println("Total (after discounts): Rs." + total);

        Payment payment = new UpiPayment("anuj@upi");
        payment.pay(total);
    }
}
