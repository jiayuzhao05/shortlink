package com.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dao.mapper.UserMapper;
import com.nageoffer.shortlink.admin.service.UserService;
import org.springframework.stereotype.Service;


/**
 * user interface implement level
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements User{
    @Override
    public UserRespDTO getUserByUsername(String username) {
        Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO result = new
        return Beanu;
    }
}
