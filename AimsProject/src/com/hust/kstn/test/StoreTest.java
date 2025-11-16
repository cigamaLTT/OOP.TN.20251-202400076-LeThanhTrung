package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {

    public static void main(String[] args) {
        Store myStore = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);

        System.out.println("--- 1. TESTING ADD DVD ---");
        myStore.addDVD(dvd1);
        myStore.addDVD(dvd2);
        myStore.addDVD(dvd3);

        System.out.println("\n--- 2. TESTING ADD DUPLICATE DVD ---");
        myStore.addDVD(dvd1);

        System.out.println("\n--- 3. TESTING REMOVE DVD BY ID (ID = 2) ---");
        myStore.removeDVD(2);

        System.out.println("\n--- 4. TESTING REMOVE DVD BY OBJECT (dvd1) ---");
        myStore.removeDVD(dvd1);

        System.out.println("\n--- 5. TESTING REMOVE NON-EXISTENT DVD (ID = 99) ---");
        myStore.removeDVD(99);
    }
}