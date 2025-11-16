package com.hust.kstn.models;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<Integer, DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new HashMap<Integer, DigitalVideoDisc>();
    }

    public void addDVD(DigitalVideoDisc disc){
        if (itemsInStore.containsKey(disc.getId())) {
            System.out.println("The disc (ID: " + disc.getId() + ") is already in the store.");
        } else {
            itemsInStore.put(disc.getId(), disc);
            System.out.println("The disc (ID: " + disc.getId() + ") has been added successfully to the store");
        }
    }

    /**
     * remove by id
     * @param id
     */
    public void removeDVD(int id){
        if(itemsInStore.remove(id) != null) {
            System.out.println("The disc (ID: " + id + ") has been removed successfully from the store");
        } else {
            System.out.println("The disc (ID: " + id + ") was not found in the store");
        }
    }

    /**
     * remove by the disc itself
     * @param disc
     */
    public void removeDVD(DigitalVideoDisc disc){
        removeDVD(disc.getId());
    }
}
