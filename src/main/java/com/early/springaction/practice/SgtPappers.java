package com.early.springaction.practice;

import org.springframework.stereotype.Component;

@Component
public class SgtPappers implements CompactDist{

    private String title = "Sgt.Pappers Lonly Heart Club Band";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing "+ title +" By " + artist);
    }
}
