package com.early.springaction.practice;

import com.early.springaction.interfaces.CompactDist;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CD播放的类
 */
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
