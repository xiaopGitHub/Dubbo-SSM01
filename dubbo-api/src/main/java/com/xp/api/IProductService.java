package com.xp.api;

import com.xp.pojo.Product;

import java.util.List;

/**
 * @author xp
 * @create 2018/11/21  14:46
 * @function 商品接口
 */
public interface IProductService {
    /*查询所有商品*/
    List<Product> selectProduct();

    /*删除指定商品*/
    Integer deleteProduct(Integer id);

    /*添加商品*/
    void insertProduct(Product product);

    /*修改商品*/
    int updateProduct(Product product);

    Product selectByPrimaryKey(Integer id);
}
