package com.user.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Package Name : com.user.user.com.entity
 * @Root Of Computer : mac
 * @Date : 2019/3/4
 * @Time : 6:20 PM
 * @Author Iparhan
 * @Company IparhanGeek
 * @Address Beijing
 */

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue
    private String uuid;
    private String username;
    private String password;
    private String realName;
    private String type;
    private String email;
    private String phone;


    private String salt;//加密密码的盐
    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    @ManyToMany(fetch= FetchType.EAGER)//立即从数据库中进行加载数据;
    @JoinTable(name = "SysUserRole", joinColumns = { @JoinColumn(name = "uuid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
    private List<Role> roleList;// 一个用户具有多个角色




    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }
}
