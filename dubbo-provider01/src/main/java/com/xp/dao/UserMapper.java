package com.xp.dao;

import com.xp.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    @Select("select * from st_user where uname=#{uname} and upwd=#{upwd}")
    @Results({
            @Result(id = true, column = "uid", property = "uid"),
            @Result(column = "uname", property = "uname"),
            @Result(column = "upwd", property = "upwd"),
            @Result(column = "ugender", property = "ugender"),
            @Result(column = "uemail", property = "uemail")
    })
    User selectUser(Map<String, Object> map);
}