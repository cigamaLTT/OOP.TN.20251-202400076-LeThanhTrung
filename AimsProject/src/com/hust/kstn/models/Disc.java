package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Disc extends Media {
    protected List<String> directors = new ArrayList<>();
    protected int length;

    public Disc(String title, String category, double cost, List<String> directors) {
        super(title, category, cost);
        this.directors = directors;
    }

    public List<String> getDirectors() {
        return directors;
    }
}
