package com.hust.kstn.models;

import java.util.List;

public class DigitalVideoDisc extends Disc {
    public DigitalVideoDisc(String title, String category, double cost, int length, List<String> directors) {
        super(title, category, cost, directors);
        super.length = length;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
