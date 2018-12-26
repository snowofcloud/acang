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
    //String类中每一个看起来会修改String值的方法，实际上都是创建了一个新的对象，并包含修改后的字符串内容，而最初的对象丝毫未动。
    //每当把String对象作为方法的参数时，都会复制一份引用，而该引用所指的对象其实一直都待在单一物理位置上，从未动过。
}
