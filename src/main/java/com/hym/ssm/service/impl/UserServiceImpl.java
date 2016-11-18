package com.hym.ssm.service.impl;

import org.apache.ibatis.session.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.EmptyStackException;
import java.util.List;

import com.hym.ssm.dao.UserDao;
import com.hym.ssm.model.User;
import com.hym.ssm.service.UserService;

/**
 * Created by dell on 2016/10/12.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    private SqlSessionFactory sqlSessionFactory;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User GetUserByName(String name){
        return userDao.selectUserByName(name);
    }

    public boolean isUserExist(User user){
        return GetUserByName(user.getUserName())!=null;
    }

    public void saveUser(User user){
        userDao.addUser(user);
    }

    public void deleteUserById(Long userId){
        userDao.deleteUserById(userId);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
