package com.xp.controller;


import com.xp.api.IProductService;
import com.xp.api.IUserService;
import com.xp.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author xp
 * @create 2018/11/21  13:03
 * @function 控制层
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IProductService productService;

    @RequestMapping("/pro")
    public List<Product> selectProduct(){
        return productService.selectProduct();
    }

    @RequestMapping("/pro/{id}")
    Product selectByPrimaryKey(@PathVariable(value = "id") int id){
        return productService.selectByPrimaryKey(id);
    }
}
