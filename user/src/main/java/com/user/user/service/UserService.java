package com.user.user.service;

import com.user.user.entity.User;

/**
 * @Package Name : com.user.user.service
 * @Root Of Computer : mac
 * @Date : 2019/3/4
 * @Time : 6:49 PM
 * @Author Iparhan
 * @Company IparhanGeek
 * @Address Beijing
 */
public interface UserService {

    public User findByUsername(String username);
}
