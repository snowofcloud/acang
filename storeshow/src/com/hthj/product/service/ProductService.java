package com.hthj.product.service;

import com.hthj.product.domain.Product;
import com.hthj.product.dao.ProductDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: xuxueqiang
 * @date: 2018/7/17 16:15
 */
public class ProductService {
    public List<Product> findAll() throws SQLException {
        ProductDao productDao = new ProductDao();
        return productDao.findAll();
    }

}
