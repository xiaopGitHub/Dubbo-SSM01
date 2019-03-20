package com.xp.api;

import com.xp.pojo.User;

/**
 * @author xp
 * @create 2018/11/21  12:51
 * @function 登陆服务层接口
 */
public interface IUserService {
    /*登陆*/
    User selectUser(String username, String password);
}
