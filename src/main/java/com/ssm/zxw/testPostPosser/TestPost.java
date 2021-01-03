package com.ssm.zxw.testPostPosser;

import com.ssm.zxw.entity.Dog;
import com.ssm.zxw.entity.Student;
import com.ssm.zxw.entity.User;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

@Component
public class TestPost implements BeanDefinitionRegistryPostProcessor {
    @SneakyThrows
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        final String[] beanNames = registry.getBeanDefinitionNames();
        for(String name : beanNames){
            if(name.equals("user")){
                BeanDefinition bd = registry.getBeanDefinition(name);
                //直接修改name的值
                MutablePropertyValues propertyValues = bd.getPropertyValues();
                propertyValues.add("name","张三丰");
                registry.registerBeanDefinition("user",bd);
                //给数组新增点值
                Class<?> c = Class.forName(bd.getBeanClassName());
                User user = (User) c.newInstance();
                int nums[] = user.getNums();
                int[] ary = Arrays.copyOf(nums, nums.length+1);
                ary[ary.length-1] = 333;
                propertyValues.add("nums",ary);
                registry.registerBeanDefinition("user",bd);
                //给数组新增点值
                Class<?> c1 = Class.forName(bd.getBeanClassName());
                User user1 = (User) c.newInstance();
                Map<String,Object> map = user1.getMap();
                map.put("王麻子",new Dog("柴犬"));
                propertyValues.add("map",map);
                registry.registerBeanDefinition("user",bd);

            }

        }
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(Student.class);
        MutablePropertyValues propertyValues =gbd.getPropertyValues();
        propertyValues.add("name","zhangsan");
        registry.registerBeanDefinition("student",gbd);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
