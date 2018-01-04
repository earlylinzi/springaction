package com.early.springaction.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {

    private CompactDist cd;

    @Autowired
    public CDPlayer(CompactDist cd){
        this.cd  = cd;
    }

    public void run(){
        cd.play();
    }
}
