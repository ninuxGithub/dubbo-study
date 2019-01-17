package com.ninuxGithub;

import com.ninuxGithub.bean.Person;
import com.ninuxGithub.service.ApiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shenzm
 * @date 2019-1-14
 * @description 作用
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ApiService bean = context.getBean(ApiService.class);
        Person person = bean.findPersonByID("1001");
        System.out.println(person);
    }
}
