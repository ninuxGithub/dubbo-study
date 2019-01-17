package com.ninuxGithub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author shenzm
 * @date 2019-1-14
 * @description 作用
 */

//https://blog.csdn.net/hellozpc/article/details/78575773  不错的博客 有dubbo  , spring cloud
public class Provider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("服务已启动");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
