package com.early.springaction.configclasses;

import com.early.springaction.aspectclasses.Audience;
import com.early.springaction.aspectclasses.SingPerformence;
import com.early.springaction.interfaces.Performence;
import org.springframework.context.annotation.*;

/**
 * aop联系的配置类
 */
@Configuration
@EnableAspectJAutoProxy//启用AspectJ代理
@ComponentScan
public class ApsectConfig {

    @Bean
    public Performence singPerformence(){
        return new SingPerformence();
    }

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
