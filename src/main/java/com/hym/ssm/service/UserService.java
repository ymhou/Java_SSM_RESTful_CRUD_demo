package com.hym.ssm.service;

import java.util.List;
import com.hym.ssm.model.User;

/**
 * Created by dell on 2016/10/12.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    boolean isUserExist(User user);

    void saveUser(User user);

    void deleteUserById(Long userId);

    void updateUser(User user);
}
