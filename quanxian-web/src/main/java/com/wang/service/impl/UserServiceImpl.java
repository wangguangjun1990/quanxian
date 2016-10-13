package com.wang.service.impl;

import com.wang.entity.User;
import com.wang.mapper.UserMapper;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private   UserMapper userMapper;

    @Override
    public User check(String name, int pwd) {
        Map map=new HashMap();
        map.put("username",name);
        map.put("passward",pwd);
       List<User> list=  userMapper.searchUserByParams(map);
        if(list.size()==1)
            return list.get(0);
        else
            return null;

    }
}
