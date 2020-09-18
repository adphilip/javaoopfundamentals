package com.adphilip.module2;

public class Demo {
    public static void main(String[] args) {

        // creating new Product objects for every program execution
        Product toothbrush = new Product("Electric Toothbrush", 3550);
        Product babyAlarm = new Product("Baby Alarm", 4999);

        // simulating retrieval of Product objects from a database
        //Static input - getProduct is done via 
        Product toothbrush2 = Catalogue.getProduct("Electric Toothbrush 2");
        Product babyAlarm2 = Catalogue.getProduct("Baby Alarm 2");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        cart.addProduct(toothbrush2);
        cart.addProduct(babyAlarm2);
        System.out.println("---------------Two : Static-----------------");
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
