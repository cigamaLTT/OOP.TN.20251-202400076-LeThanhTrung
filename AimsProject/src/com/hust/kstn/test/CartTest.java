package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {
        Cart myCart = new Cart();

        System.out.println("--- 1. TESTING REMOVE FROM EMPTY CART ---");
        DigitalVideoDisc dummyDvd = new DigitalVideoDisc("Dummy DVD", "Dummy", "Dummy", 0, 0.0);
        myCart.remove_DVD(dummyDvd);
        myCart.print();


        System.out.println("\n--- 2. TESTING ADDING 20 ITEMS ---");
        DigitalVideoDisc newDvd;
        for (int i = 1; i <= 20; i++) {
            newDvd = new DigitalVideoDisc("DVD " + i, "Category", "Director", 120, 10.0 + i);
            myCart.add_DVD(newDvd);
        }
        myCart.print();

        System.out.println("\n--- 3. TESTING ADDING 21st ITEM ---");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("DVD 21", "Category", "Director", 120, 31.0);
        myCart.add_DVD(dvd21);
        myCart.print();

        System.out.println("\n--- 4. TESTING REMOVE NON-EXISTENT ITEM ---");
        myCart.remove_DVD(dummyDvd);
        myCart.print();


        System.out.println("\n--- 5. TESTING REMOVE EXISTING ITEM ---");
        DigitalVideoDisc dvdToRemove = new DigitalVideoDisc("DVD 10");

        myCart.remove_DVD(dvdToRemove);
        myCart.print();
    }
}