package com.user.user.service.impl;

import com.user.user.entity.User;
import com.user.user.dao.UserDao;
import com.user.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package Name : com.user.user.service.impl
 * @Root Of Computer : mac
 * @Date : 2019/3/4
 * @Time : 6:50 PM
 * @Author Iparhan
 * @Company IparhanGeek
 * @Address Beijing
 */

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDao userDao;


    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
