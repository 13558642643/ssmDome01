package com.ssm.zxw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-12-29 14:05
 * @Description :
 */
@Aspect
@Component
public class LogRecordAspect {
    @Before("execution(* com.ssm.zxw.controller..*(..))")
    public void before(){
        System.out.println("【LogRecordAspect -》 before】");

    }


}
