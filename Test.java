package com.xly.spring.boot.mybatisplus.server.entity.base;

/**
 * @auther xuxq
 * @date 2018/12/26 23:39
 */
public class Test {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String test = "test";
        System.out.println(test);
        String upcase = upcase(test);
        System.out.println(upcase);
    }

}
