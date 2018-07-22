package com.hthj.product.dao;

import com.hthj.product.domain.Product;
import com.hthj.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: xuxueqiang
 * @date: 2018/7/17 16:37
 */
public class ProductDao {
    public List<Product> findAll() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql="select * from  product order by pdate desc";
        List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        System.out.println(1);
        return list;
    }
}
