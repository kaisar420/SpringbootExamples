package com.user.user.dao;

import com.user.user.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Package Name : com.user.user.dao
 * @Root Of Computer : mac
 * @Date : 2019/3/4
 * @Time : 6:48 PM
 * @Author Iparhan
 * @Company IparhanGeek
 * @Address Beijing
 */


public interface UserDao extends CrudRepository<User,String> {
    public User findByUsername(String username);
}
