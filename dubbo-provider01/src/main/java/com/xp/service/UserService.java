package com.xp.service;

import com.xp.api.IUserService;
import com.xp.dao.UserMapper;
import com.xp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xp
 * @create 2018/11/21  12:51
 * @function 登录接口实现类
 */
//第三步, 在要使用事务的方法所在的类(一般在业务层)上面添加@Transactional注解
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(String username, String password) {
        Map<String,Object> map=new HashMap<>();
        map.put("uname", username);
        map.put("upwd", password);
        return userMapper.selectUser(map);
    }
}
