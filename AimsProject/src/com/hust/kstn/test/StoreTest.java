package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;
import java.util.ArrayList;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {
        Store myStore = new Store();

        List<String> directors1 = new ArrayList<>();
        directors1.add("Roger Allers");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.99, 87, directors1);

        List<String> directors2 = new ArrayList<>();
        directors2.add("George Lucas");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95, 124, directors2);

        List<String> directors3 = new ArrayList<>();
        directors3.add("John Musker");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99, 90, directors3);

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