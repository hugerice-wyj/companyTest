package com.cloud.backstage1.dao;

import com.cloud.common.pojo.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 22110334
 */
@Mapper
public interface TestUserDao {
    /**
     * 查找用户
     * @param username 用户名
     * @param password 密码
     * @return 查询数量
     */
    int queryByNameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 查找用户
     * @param username 用户名
     * @return 用户信息
     */
    TestUser queryByUsername(@Param("username") String username);

}
