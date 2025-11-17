package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Media {
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

    private int numOfTokens;

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public Book(String title, String category, double cost, int numOfTokens, BookAuthor... authors) {
        super(title, category, cost);
        this.authors.addAll(Arrays.asList(authors));
        this.numOfTokens = numOfTokens;
    }

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[" + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
