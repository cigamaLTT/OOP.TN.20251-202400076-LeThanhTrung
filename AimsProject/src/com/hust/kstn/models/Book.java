package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    public static class BookAuthor{
        private String fullName;
        private int yearOfBirth;
        private String shortBiography;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getShortBiography() {
            return shortBiography;
        }

        public void setShortBiography(String shortBiography) {
            this.shortBiography = shortBiography;
        }

        public BookAuthor(String fullName, int yearOfBirth, String shortBiography) {
            this.fullName = fullName;
            this.yearOfBirth = yearOfBirth;
            this.shortBiography = shortBiography;
        }

        @Override
        public String toString() {
            return this.fullName + " ("
                    + this.yearOfBirth + ", "
                    + this.shortBiography + ")\n";
        }

    }


    private List<BookAuthor> authors = new ArrayList<>();

    private int id;
    private String title;
    private String category;
    private double cost;
    private int length;

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public Book(int id, String title, String category, double cost, int length, BookAuthor... authors) {
        this.authors.addAll(Arrays.asList(authors));
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.length = length;
    }

    public Book(int id, String title, String category, double cost, int length, List<BookAuthor> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.length = length;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "]["
                + this.title + "]["
                + this.cost + "]["
                + this.category + "]["
                + this.length + "]"
                + "\nAuthors: " + this.authors;
    }
}
