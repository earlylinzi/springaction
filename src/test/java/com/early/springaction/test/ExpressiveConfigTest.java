package com.early.springaction.test;

import com.early.springaction.configclasses.ExpressiveConfig;
import com.early.springaction.interfaces.CompactDist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressiveConfig.class)
public class ExpressiveConfigTest {

    @Autowired
    private CompactDist compactDist;
    @Test
    public void testPropertiesResource(){
        compactDist.play();
    }

}
