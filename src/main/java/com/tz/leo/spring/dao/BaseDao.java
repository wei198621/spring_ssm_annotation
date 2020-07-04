package com.tz.leo.spring.dao;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/2 23:25
 * Content:
 */
public interface BaseDao<T> {

    public void save(T t);
    public List<T> findAll();
}
