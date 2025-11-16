package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsInCart[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public boolean addOneDVD(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBER_ORDERED){
            return false;
        }
        this.itemsInCart[this.qtyOrdered] = disc;
        this.qtyOrdered++;
        return true;
    }

    public void add_DVD(DigitalVideoDisc disc){
        if(addOneDVD(disc)) {
            System.out.println("The disc has been added successfully");
        }else{
            System.out.println("The Cart is full");
        }
    }

    public void add_DVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        boolean isDisc1Added = addOneDVD(disc1);
        boolean isDisc2Added = addOneDVD(disc2);

        if(isDisc1Added && isDisc2Added){
            System.out.println("Both discs has been added successfully");
        } else if(isDisc1Added && !isDisc2Added){
            System.out.println("Only " + disc1.getTitle() + " was added, the Cart is full");
        } else{
            System.out.println("The Cart is full, both discs were rejected");
        }
    }

    public void add_DVD(DigitalVideoDisc... discs) {
        boolean isAtLeastOneDiskAdded = false;
        boolean isAtLeastOneDiskRejected = false;
        for (DigitalVideoDisc disc : discs){
            if(addOneDVD(disc)){
                if(!isAtLeastOneDiskAdded){
                    System.out.print("List of Discs have been added: [" + disc.getTitle());
                }else {
                    System.out.print(", " + disc.getTitle());
                }
                isAtLeastOneDiskAdded = true;
            } else{
                isAtLeastOneDiskRejected = true;
                break;
            }
        }
        if(isAtLeastOneDiskRejected){
            System.out.println("]\nThe Cart is full, cannot add other discs");
        } else{
            System.out.println("]\nAll discs have been added successfully");
        }
    }

    public void remove_DVD(DigitalVideoDisc disc){
        if (qtyOrdered == 0){
            System.out.println("The cart is empty");
            return;
        }

        int found = -1;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsInCart[i].getTitle().equals(disc.getTitle())) {
                found = i;
                break;
            }
        }

        if (found == -1) {
            System.out.println("The disc does not exist");
        } else {
            for (int i = found; i < this.qtyOrdered - 1; i++) {
                this.itemsInCart[i] = this.itemsInCart[i + 1];
            }
            this.itemsInCart[this.qtyOrdered - 1] = null;
            this.qtyOrdered--;
            System.out.println("The disc has been removed sucessfully");
        }
    }

    public double calculate_total_cost(){
        double total_cost = 0;
        for (int i = 0; i < this.qtyOrdered; i++){
            total_cost += this.itemsInCart[i].getCost();
        }
        return total_cost;
    }

    public void print(){
        if(qtyOrdered == 0){
            System.out.println("The Cart is empty!!!");
            return;
        }
        System.out.println("=================================== THE CURRENT CART ===================================");
        System.out.println("Total items: " + qtyOrdered);

        for (int i = 0; i < this.qtyOrdered; i++){
            System.out.println(itemsInCart[i]);
        }
        System.out.println("========================================================================================");

    }


}
