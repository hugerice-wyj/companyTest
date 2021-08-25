package com.cloud.backstage1.service.impl;

import com.cloud.backstage1.dao.TestUserDao;
import com.cloud.backstage1.service.TestUserService;
import com.cloud.common.pojo.TestUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 22110334
 */
@Service
public class TestUserImpl implements TestUserService {
    @Resource
    private TestUserDao testUserDao;
    @Override
    public boolean login(String username, String password) {
        if("".equals(username) || "".equals(password) || username == null || password == null){return false;}
        return testUserDao.queryByNameAndPassword(username,password) > 0;
    }

    @Override
    public TestUser getTestUserByUsername(String username) {
        if("".equals(username) || username == null ){return null;}
        return testUserDao.queryByUsername(username);
    }
}
