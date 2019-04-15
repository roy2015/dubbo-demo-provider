package com.roy.dubbo.provider.service.demo.impl;

import com.roy.dubbo.exception.HelloWorldException;
import com.roy.dubbo.provider.service.demo.DemoService;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2019/4/15.
 */

@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println(String.format("入参为 a = %s, b= %s" , a,b ));
        return a + b;
    }

    @Override
    public String throwException() {
        throw new BeanCurrentlyInCreationException("123");
    }


}
