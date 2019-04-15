package com.roy.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 2019/4/15.
 */
public class ProviderMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
