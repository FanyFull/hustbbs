package com.hust.dao;

import com.hust.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Mapper 表示本类是一个 MyBatis 的 mapper
@Mapper
@Repository
public interface UserMapper {

    // 获取所有用户的信息
    List<User> getUserLists();

    /**
     * 根据 id 查询用户
     * @param id 用户的 id
     * @return 如果查询到了，则返回该用户实体类 User，否则返回 null
     */
    User queryUserById(int id);

    /**
     * 根据用户名和密码来查询用户
     * @param uname
     * @param pwd
     * @return
     */
    User queryUserByUnameAndPwd(@Param("uname") String uname, @Param("pwd") String pwd);

}
