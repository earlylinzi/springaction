package com.early.springaction.test;

import com.early.springaction.aspectclasses.SingPerformence;
import com.early.springaction.configclasses.ApsectConfig;
import com.early.springaction.configclasses.ExpressiveConfig;
import com.early.springaction.interfaces.Performence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApsectConfig.class)
public class ApsectTest {

    @Autowired
    private Performence performence;

    @Test
    public void singPerformenceTest(){
        performence.perform();
    }

}
