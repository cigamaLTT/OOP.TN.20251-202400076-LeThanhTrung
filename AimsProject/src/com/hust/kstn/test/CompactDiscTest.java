package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.CompactDisc.Track;
import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {

    public static void main(String[] args) {

        System.out.println("--- 1. TESTING CREATION & TOTAL LENGTH ---");

        Track track1 = new Track("Track 01", 180);
        Track track2 = new Track("Track 02", 210);
        Track track3 = new Track("Track 03", 150);

        List<String> artists = new ArrayList<>();
        artists.add("Main Artist");
        List<String> directors = new ArrayList<>();
        directors.add("Main Director");

        CompactDisc cd1 = new CompactDisc(
                "My First CD",
                "Music",
                15.99,
                artists,
                directors,
                track1, track2
        );

        System.out.println(cd1);
        System.out.println("Total Length: " + cd1.totalLength());

        System.out.println("\n--- 2. TESTING ADD TRACK ---");

        cd1.addTrack(track3);
        cd1.addTrack(track1);

        System.out.println(cd1);
        System.out.println("New Total Length: " + cd1.totalLength());

        System.out.println("\n--- 3. TESTING REMOVE TRACK ---");

        cd1.removeTrack(track2);
        cd1.removeTrack(track2);

        System.out.println(cd1);
        System.out.println("Final Total Length: " + cd1.totalLength());
    }
}