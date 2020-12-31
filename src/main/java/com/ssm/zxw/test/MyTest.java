package com.ssm.zxw.test;

import com.ssm.zxw.entity.Student;
import com.ssm.zxw.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    /**
     * 冒泡排序
     */
    @Test
    public void test(){
        System.out.println("asdas");
        int nums[] = {1,124,123,5123,123,4132,123,12,41,552,1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int a = nums[i];
                int b = nums[j];
                if(a < b){
                    nums[i] = b;
                    nums[j] = a;
                }
            }
        }
        for(int a : nums){
            System.out.print(a +",");
        }
    }

    @Test
    public void test1(){
        System.out.println("asdas");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("姓名:"+user.getName());
        for (int i :user.getNums()){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("【map值：】"+user.getDogName("王麻子"));

    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("学生姓名:"+student.getUserName());

    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("学生姓名:"+student.getUserName());

    }

    public static int lookNum(){
        try {
            System.out.println("try");
            return  1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
            return  1 / 0;
        } finally {
            System.out.println("finally");



        }

    }

    @Test
    public void test4(){
        System.out.println("查看");
        lookNum();
    }


}
