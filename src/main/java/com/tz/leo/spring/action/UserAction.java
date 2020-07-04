package com.tz.leo.spring.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.tz.leo.spring.entity.User;
import com.tz.leo.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/2 23:21
 * Content:
 */
@Transactional
@Controller(value = "userAction")
@Scope("prototype")
public class UserAction  {

    @Autowired
    private UserService userService;

    private  List<User> users;


    public String findAll(){
        this.users= userService.findAll();
        return Action.SUCCESS;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
