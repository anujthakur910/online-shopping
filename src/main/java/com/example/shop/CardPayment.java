package com.example.shop;

public class CardPayment implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paying Rs." + amount + " using Card ending with " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}
