package com.ssm.zxw.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    private String name;

    public Dog() {
        System.out.println("dfsdf");
    }


    public Dog(String name) {
        this.name = name;
    }
}
