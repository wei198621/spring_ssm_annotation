package com.tz.leo.spring.test2;

import com.tz.leo.spring.entity.User;
import com.tz.leo.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/4 18:27
 * Content:
 */
public class testUserTest2 extends BasicTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
