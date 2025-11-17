package com.hust.kstn.models;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[" + this.director + "]"
                + "[" + this.length + "]";
    }

}
