package com.neusoft.spring.aop;

import com.neusoft.spring.beans.CellPhone;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("iphone")
public class IPhone implements CellPhone {

    public void call() {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (Exception e) {
            System.out.println("");
        }
        System.out.println("this is iphone calling");

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public String sendMsg(String msg) {
        System.out.println("this is iphone sendmsg ===" + msg);
        if(true){
            throw new RuntimeException();
        }
        return msg;
    }

}
