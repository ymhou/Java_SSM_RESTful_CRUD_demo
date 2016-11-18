package com.hym.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.hym.ssm.model.User;

import java.util.List;

/**
 * Created by dell on 2016/10/12.
 */
@Repository
public interface UserDao {
    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();

    User selectUserByName(@Param("userName") String userName);

    void addUser(User user);

    void deleteUserById(@Param("userId") Long userId);

    void updateUser(User user);
}

