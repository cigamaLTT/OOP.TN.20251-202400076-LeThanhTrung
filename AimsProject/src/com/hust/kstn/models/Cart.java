package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsInCart[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void add_DVD(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBER_ORDERED){
            System.out.println("The cart is full");
            return;
        }
        this.itemsInCart[this.qtyOrdered] = disc;
        this.qtyOrdered++;
        System.out.println("The disc has been added successfully");
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
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");

        for (int i = 0; i < this.qtyOrdered; i++){
            System.out.println("[Title]: " + this.itemsInCart[i].getTitle() +
                    ", " + "[Cost]: " + this.itemsInCart[i].getCost());
        }
    }
}
