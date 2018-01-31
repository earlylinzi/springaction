package com.early.springaction.aspectclasses;

/**
 * 有表演的接口还是要有观众的类  这个类就表示观众
 * 观众在表演前后都会有一定的行为
 */

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  // 表示不仅是一个pojo还是一个切面
public class Audience {


    /**
     * 表演前需要手机静音（每次表演前都需要）
     */
    @Before("execution(* com.early.springaction.interfaces.Performence.perform(..))")
    public void silenceCellPhone(){
        System.out.println("Silenceing Cellphones");
    }

    /**
     * 表演开始前需要先落座
     */
    @Before("execution(* com.early.springaction.interfaces.Performence.perform(..))")
    public void takeSeats(){
        System.out.println("taking  seats");
    }

    /**
     * 表演之后要鼓掌
     */
    @AfterReturning("execution(* com.early.springaction.interfaces.Performence.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP !");
    }

    /**
     * 表演失败之后要求退钱
     */
    @AfterThrowing("execution(* com.early.springaction.interfaces.Performence.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }


}
