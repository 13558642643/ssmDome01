package com.ssm.zxw.algorithm;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 队列的特性是：“先入先出”
 * 栈的特性是：“先入后出”
 */
public class 用两个栈来实现队列 {
    static  Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if(stack2.size() <= 0){
            while (stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            push(i);
        }
        System.out.println( pop());

    }
}
