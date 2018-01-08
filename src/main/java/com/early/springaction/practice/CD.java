package com.early.springaction.practice;

import com.early.springaction.interfaces.CompactDist;

/**
 * CD的具体实现类（实现了CompactDist接口的类）
 */
public class CD implements CompactDist {

    public void play() {
        System.out.println("CDCDCDCDCD");
    }
}
