package com.early.springaction.configclasses;

import com.early.springaction.interfaces.CompactDist;
import com.early.springaction.practice.*;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan
public class CDPlayerConfig {
    /**
     * 该注解是会告诉Spring这个方法将会返回一个对象该对象要注册为Spring上下文的bean
     * 默认情况下bean的id是方法名，可以使用name属性设置
     *
     */
    @Bean
//    @Profile("dev")
    public CompactDist sgtPeppers(){
        return new SgtPappers();
    }

    @Bean
//    @Profile("test")
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


    /**
     * 这条件必须是实现了org.springframework.context.annotation.Condition这个接口的类
     * @Profile 这个注解实际上在底层用的就有这个@Conditional注解
     * @return
     */
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }



}
