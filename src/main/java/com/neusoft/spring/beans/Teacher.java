package com.neusoft.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("ttt")
@Scope("prototype")
public class Teacher {  //'teacher'
    String name;

    CellPhone phone;

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {
        System.out.println("teacher");
    }

    @Autowired(required = false)  //by type
    @Qualifier("iphone")
    public void setPhone(CellPhone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
