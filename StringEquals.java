package com.c503.hthj.asoco.dangerchemical.waste.config;

import java.io.Serializable;
import java.util.Objects;
/**
 * @auther xuxq
 * @date 2018/12/27 22:33
 */
public final class StringEquals implements Serializable,Comparable<String>, CharSequence {

    private final char value[];

    public static void main(String[] args) {

    }
    //String的equals
    public boolean equals(Object object){
        if (this == object){//首先和自己比较
            return true;
        }
        if (object instanceof String){//判断对象是否是String的实例
            String anotherObject = (String)object;
            int n = value.length;
            if (n == anotherObject.value.length) {//看看长度是否相等
                char v1[] = value;
                char v2[] = anotherObject.value;
                int i = 0;
                while (n-- != 0) {//最后比较里面的每个字符串是否相等
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }



}
