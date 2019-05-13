package com.roy.dubbo.provider.service.demo.impl;

import com.roy.dubbo.exception.HelloWorldException;
import com.roy.dubbo.provider.service.demo.DemoService;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2019/4/15.
 */

@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {

    private String name;

    @Value(value = "${name}")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println(String.format("入参为 a = %s, b= %s" , a,b ));
        return a + b;
    }

    @Override
    public String throwException() {
//        throw new BeanCurrentlyInCreationException("123");
        throw new HelloWorldException("123");
    }


}
