package com.ssm.zxw.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
public class User {
    private String name = "zxw";

    private int nums[] = {1,3,4};

    private Map<String,Object> map = new HashMap<>();

    public User() {
        map.put("张三",new Dog("柯基1号"));
        map.put("里斯",new Dog("柯基2号"));
    }

    public Object getDogName(String name){
        return map.get(name);
    }
}
