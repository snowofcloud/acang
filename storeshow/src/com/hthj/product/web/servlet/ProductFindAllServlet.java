package com.hthj.product.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import com.hthj.product.domain.Product;
import com.hthj.product.service.ProductService;
/**
 * @author: xuxueqiang
 * @date: 2018/7/17 16:09
 */
public class ProductFindAllServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ProductService productService = new ProductService();
            List<Product> list=productService.findAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/jsp/product_list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
