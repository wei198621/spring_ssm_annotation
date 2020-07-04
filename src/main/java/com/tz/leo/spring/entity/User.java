package com.tz.leo.spring.entity;

import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/7/2 23:19
 * Content:
 */
public class User {
    private Integer id;
    private String name;
    private Date  bir;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, Date bir, Integer age) {
        this.id = id;
        this.name = name;
        this.bir = bir;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bir=" + bir +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
