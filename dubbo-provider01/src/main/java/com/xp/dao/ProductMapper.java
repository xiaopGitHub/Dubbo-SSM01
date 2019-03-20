package com.xp.dao;

import com.xp.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    @Select("select * from product")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "pname", property = "pname"),
            @Result(column = "price", property = "price"),
            @Result(column = "unit", property = "unit"),
            @Result(column = "pdate", property = "pdate"),
            @Result(column = "rate", property = "rate"),
            @Result(column = "type", property = "type"),
    })
    List<Product> selectProduct();

    @Delete("delete from product where id=#{id}")
    int deleteProduct(Map<String, Object> map);

    @Update("update product set price=#{price} where id=#{id}")
    int updateProduct(Map<String, Object> map);
}