package com.early.springaction.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ComponentScan
public class CDPlayerConfig {
    /**
     * 该注解是会告诉Spring这个方法将会返回一个对象该对象要注册为Spring上下文的bean
     * 默认情况下bean的id是方法名，可以使用name属性设置
     *
     */
    @Bean
    @Profile("dev")
    public CompactDist sgtPeppers(){
        return new SgtPappers();
    }

    @Bean
    @Profile("test")
    public CompactDist cd(){
        return new CD();
    }


    @Bean
    public CDPlayer cdPlayer(CompactDist sgtPeppers){
        return new CDPlayer(sgtPeppers);
    }
    @Bean
    public CDPlayer cdPlayer3(CompactDist cd){
        return new CDPlayer(cd);
    }
    @Bean // 自动将sgtPeppers 的bean注入
    public CDPlayer cdPlayer2(){
        return new CDPlayer(sgtPeppers());
    }




}
