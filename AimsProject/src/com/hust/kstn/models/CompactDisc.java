package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDisc extends Media {
    public static class Track{
        private String title;
        private int length;

        public String getTitle() {
            return title;
        }

        public int getLength() {
            return length;
        }

        public Track(String title, int length) {
            this.title = title;
            this.length = length;
        }

        @Override
        public String toString() {
            return this.title + " ("
                    + this.length + ")\n";
        }
    }

    private List<Track> tracks = new ArrayList<>();
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();

    public List<Track> getTracks() {
        return tracks;
    }

    public List<String> getArtists() {
        return artists;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public CompactDisc(String title, String category, double cost, List<String> artists, List<String> directors, List<Track> tracks) {
        super(title, category, cost);
        this.artists = artists;
        this.directors = directors;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, double cost, List<String> artists, List<String> directors, Track... tracks) {
        super(title, category, cost);
        this.artists = artists;
        this.directors = directors;
        this.tracks.addAll(Arrays.asList(tracks));
    }

    public int totalLength(){
        int sum = 0;
        for(Track track: this.tracks){
            sum += track.getLength();
        }
        return sum;
    }

    public void addTrack(Track track){
        if(tracks.contains(track)){
            System.out.println("Track (Title: " + track.getTitle() + ") already exists in the CD.");
        }else{
            tracks.add(track);
            System.out.println("Track (Title: " + track.getTitle() + ") has been added.");
        }
    }

    public void removeTrack(Track track){
        if(tracks.contains(track)){
            tracks.remove(track);
            System.out.println("Track (Title: " + track.getTitle() + ") has been removed.");
        }else{
            System.out.println("Track (Title: " + track.getTitle() + ") does not exist in the CD.");
        }
    }

    public String toString() {
        return super.toString()
                + "[" + "\nTracks: " + this.tracks;
    }
}
