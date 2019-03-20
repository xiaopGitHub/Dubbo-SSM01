package com.xp.service;

import com.xp.api.IProductService;
import com.xp.dao.ProductMapper;
import com.xp.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xp
 * @create 2018/11/21  14:47
 * @function 商品接口实现类
 */
@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectProduct() {
        return productMapper.selectProduct();
    }

    @Override
    public Integer deleteProduct(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return productMapper.deleteProduct(map);
    }

    @Override
    public void insertProduct(Product product) {
        Product p = new Product();
        p.setPname(product.getPname());
        p.setPrice(product.getPrice());
        p.setUnit(product.getUnit());
        p.setPdate(product.getPdate());
        p.setRate(product.getRate());
        p.setType(product.getType());
        productMapper.insert(p);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public Product selectByPrimaryKey(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
