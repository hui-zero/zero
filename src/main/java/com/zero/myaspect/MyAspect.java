package com.zero.myaspect;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("前置通知。。。");
    }

    public void afterRturning(){
        System.out.println("后置通知。。。");
    }

    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("环绕通知前。。。");
            joinPoint.proceed();
            System.out.println("环绕通知后。。。");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
