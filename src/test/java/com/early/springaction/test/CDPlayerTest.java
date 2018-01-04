package com.early.springaction.test;

import com.early.springaction.practice.CDPlayer;
import com.early.springaction.practice.CDPlayerConfig;
import com.early.springaction.practice.CompactDist;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  SpringJUnit4ClassRunner 这个类在加载的时候可以自动创建spring的上下文
 *  注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
@ActiveProfiles("dev")
public class CDPlayerTest {

    @Autowired
    private CompactDist cd;

    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    private CDPlayer cdPlayer2;
    @Autowired
    private CDPlayer cdPlayer3;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
        cd.play();
    }

    @Test
    public void cdPlayerRun(){
        cdPlayer.run();
    }
    @Test
    public void cdPlayerRun2(){
        cdPlayer2.run();
    }
    @Test
    public void cdPlayerRun3(){
        cdPlayer3.run();
    }
}
