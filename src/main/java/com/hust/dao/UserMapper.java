package com.hust.dao;

import com.hust.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Mapper 表示本类是一个 MyBatis 的 mapper
@Mapper
@Repository
public interface UserMapper {

    // 获取所有用户的信息
    List<User> getUserLists();

}
