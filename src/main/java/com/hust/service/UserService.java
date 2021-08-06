package com.hust.service;

import com.hust.dao.UserMapper;
import com.hust.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserService implements UserMapper {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUserLists() {
        return userMapper.getUserLists();
    }

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public User queryUserByUnameAndPwd(String uname, String pwd) {
        return userMapper.queryUserByUnameAndPwd(uname, pwd);
    }
}
