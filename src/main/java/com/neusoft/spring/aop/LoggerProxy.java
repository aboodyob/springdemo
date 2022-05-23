package com.neusoft.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component
public class LoggerProxy {
    @Pointcut("execution(* com.neusoft..*.*(..))")
    public void commonMethod() {
    }

    @Before("commonMethod()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("logger beforeMethod");
    }

    @After("commonMethod()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("logger afterMethod");
    }


}
