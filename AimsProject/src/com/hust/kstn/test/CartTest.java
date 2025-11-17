package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
import java.util.ArrayList;
import java.util.List;

public class CartTest {

    public static void main(String[] args) {
        Cart myCart = new Cart();

        System.out.println("--- 1. TESTING REMOVE FROM EMPTY CART ---");
        List<String> dummyDirectors = new ArrayList<>();
        dummyDirectors.add("Dummy");
        DigitalVideoDisc dummyDvd = new DigitalVideoDisc("Dummy DVD", "Dummy", 0.0, 0, dummyDirectors);
        myCart.remove_DVD(dummyDvd);
        myCart.print();

        System.out.println("\n--- 2. TESTING ADDING 20 ITEMS ---");
        DigitalVideoDisc newDvd;
        List<String> itemDirectors = new ArrayList<>();
        itemDirectors.add("Director");

        for (int i = 1; i <= 20; i++) {
            newDvd = new DigitalVideoDisc("DVD " + i, "Category", 10.0 + i, 120, itemDirectors);
            myCart.add_DVD(newDvd);
        }
        myCart.print();

        System.out.println("\n--- 3. TESTING ADDING 21st ITEM ---");
        List<String> directors21 = new ArrayList<>();
        directors21.add("Director");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("DVD 21", "Category", 31.0, 120, directors21);
        myCart.add_DVD(dvd21);
        myCart.print();

        System.out.println("\n--- 4. TESTING REMOVE NON-EXISTENT ITEM ---");
        myCart.remove_DVD(dummyDvd);
        myCart.print();

        System.out.println("\n--- 5. TESTING REMOVE EXISTING ITEM ---");
        List<String> removeDirectors = new ArrayList<>();
        removeDirectors.add("Director");
        DigitalVideoDisc dvdToRemove = new DigitalVideoDisc("DVD 10", "Category", 0.0, 0, removeDirectors);

        myCart.remove_DVD(dvdToRemove);
        myCart.print();
    }
}