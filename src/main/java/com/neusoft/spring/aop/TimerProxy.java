package com.neusoft.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Order(2)
@Aspect
@Component
public class TimerProxy {
    @Pointcut("execution(* com.neusoft..*.*(..))")
    public void commonMethod() {
    }

    @Before("commonMethod()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method's name is " + methodName + " ars: " + args);
        System.out.println("beforeMethod");
    }

    @After("commonMethod()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method's name is " + methodName + " ars: " + args);
        System.out.println("afterMethod");
    }
//
//    @AfterReturning(value = "commonMethod()", returning = "result")
//    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
//        String methodName = joinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(joinPoint.getArgs());
//        System.out.println("the method's name is " + methodName + " ars: " + args + "result is:" + result);
//        System.out.println("AfterReturning");
//    }
//
//    @AfterThrowing(value = "commonMethod()", throwing = "ex")
//    public void afterReturningMethod(JoinPoint joinPoint, Exception ex) {
//        String methodName = joinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(joinPoint.getArgs());
//        System.out.println("Exception is:" + ex);
//        System.out.println("AfterThrowing");
//    }
//
//    @Around(value = "commonMethod()")
//    public void aroundMethod(ProceedingJoinPoint joinPoint) {
//        Object result = null;
//        String methodName = joinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(joinPoint.getArgs());
//        try{
//            result = joinPoint.proceed();
//            System.out.println(result);
//        }catch (Throwable e){
//            System.out.println("the method's name is " + methodName + " ars: " + args + "Throwable is:" + e);
//        }
//        System.out.println("Around");
//    }

}
