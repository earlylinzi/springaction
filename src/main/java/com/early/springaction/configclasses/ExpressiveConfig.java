package com.early.springaction.configclasses;

import com.early.springaction.practice.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/conf/app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc(){// env其实取的就是系统的参数
        return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }

}
