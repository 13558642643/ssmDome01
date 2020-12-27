package com.ssm.zxw.algorithm;

public class 斐波拉契数列 {
    public static void main(String[] args) {
        int a = 1,b =1;
        System.out.print(a + "，"+b+ "，");
        addNum(a,b);
    }

    public static void addNum(int a , int b ){
        int c = a + b;
        System.out.print(c+"，");
        addNum(b,c);
    }
}
