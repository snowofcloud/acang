package com.c503.hthj.asoco.dangerchemical.waste.base;

/**
 * @auther xuxq
 * @date 2019/1/1 23:02
 */
public class Recurse {
    public static void main(String[] args) {
        System.out.println(recurse(9));
    }

    public static int recurse(int n){
        if (n <= 2){
            return 1;
        }else {
            return recurse(n-1) + recurse(n-2);
        }
    }
}
