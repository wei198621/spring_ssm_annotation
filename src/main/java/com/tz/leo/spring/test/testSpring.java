package com.tz.leo.spring.test;

import com.tz.leo.spring.entity.User;
import com.tz.leo.spring.service.UserService;
import com.tz.leo.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/2 23:20
 * Content:
 */
public class testSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-basic.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
