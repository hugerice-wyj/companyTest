package com.cloud.backstage1.service;

import com.cloud.common.pojo.TestUser;

/**
 * @author 22110334
 */
public interface TestUserService {
    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return true;false
     */
    boolean login(String username,String password);

    /**
     * 查询用户
     * @param username 用户名
     * @return 用户信息
     */
    TestUser getTestUserByUsername(String username);
}
