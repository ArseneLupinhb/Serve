package com.wave.serve.depot.depotserve.service.impl;

import com.wave.serve.depot.depotserve.dao.UserInfoMapper;
import com.wave.serve.depot.depotserve.pojo.dt.UserInfo;
import com.wave.serve.depot.depotserve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public int login(UserInfo userInfo) {

        return userInfoMapper.login(userInfo);
    }
}
