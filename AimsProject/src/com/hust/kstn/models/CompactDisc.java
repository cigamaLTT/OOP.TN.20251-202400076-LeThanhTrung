package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDisc extends Disc {
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

    public List<Track> getTracks() {
        return tracks;
    }

    public List<String> getArtists() {
        return artists;
    }

    public CompactDisc(String title, String category, double cost, List<String> directors, List<String> artists, List<Track> tracks) {
        super(title, category, cost, directors);
        this.artists = artists;
        this.tracks = tracks;
        super.length = this.totalLength();
    }

    public CompactDisc(String title, String category, double cost, List<String> directors, List<String> artists, Track... tracks) {
        super(title, category, cost, directors);
        this.artists = artists;
        this.tracks.addAll(Arrays.asList(tracks));
        super.length = this.totalLength();
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
