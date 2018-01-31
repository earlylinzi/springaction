package com.early.springaction.aspectclasses;

import com.early.springaction.interfaces.Performence;

/**
 * 实现了表演接口的歌唱表演类
 */
public class SingPerformence implements Performence{

    public void perform() {
        System.out.println("sing a song");
    }
}
