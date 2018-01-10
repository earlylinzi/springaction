package com.early.springaction.practice;

import com.early.springaction.interfaces.CompactDist;

public class BlankDisc implements CompactDist {
    private String title;
    private String artist;

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }


    public void play() {
        System.out.println("Playing "+ title +" By " + artist);
    }
}
