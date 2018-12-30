package com.spring.boot.mybatis.server.entity;

import java.util.Locale;

/**
 * @auther xuxq
 * @date 2018/12/25 21:38
 */
public class Bitch {

       public static void main(String[] args) {
        //字符串的split、trim 、contains、valueOf、toString、format、concat、hashCode、replace、matches、join、intern、copyValueOf
        //首先String不属于8种基本数据类型，String是一个对象。
        String s1 = "low_salary";
        String s2 = "low";
        String s3 = "LOW_SALARY";
        String s4 = "low_salary";
              
        split
        System.out.println(s1.split("w"));//字符串长度截取-------------底层方法如下，下同。
        /* public String[] split(String regex) {
            return split(regex, 0);
         }*/
              
        trim
        System.out.println(s1.trim());//去掉字符串两端的空白（头尾的空白）
        /*public String trim() {
            int len = value.length;
            int st = 0;
            char[] val = value;    //avoid getfield opcode

            while ((st < len) && (val[st] <= ' ')) {
                st++;
            }
            while ((st < len) && (val[len - 1] <= ' ')) {
                len--;
            }
            return ((st > 0) || (len < value.length)) ? substring(st, len) : this;
        }*/
              
        valueOf
        System.out.println(String.valueOf(s1));//将s1转为字符串
        /*public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }*/
              
        contains
        System.out.println(s1.contains("s"));//判断左边的字符串是否包含右边的内容，返回true/false
        /*public boolean contains(CharSequence s) {
            return indexOf(s.toString()) > -1;
        }*/
        
        toString
        System.out.println(s1.toString());//将s1重写字符串
       /* public String toString() {
            return this;
        }*/
              
        format
        System.out.println(s1.format());//判断s1是否以y结尾
        //1 占位符
        //1.1 单个占位符
        //String s = String.format("Hello %s，Welcome to my blog!", "jerry");
        //System.out.println(s);//Hello jerry，Welcome to my blog!
        //1.2 多个占位符
        //
        //
        /*public boolean endsWith(String suffix) {
            return startsWith(suffix, value.length - suffix.value.length);
        }*/
        //format(String format, Object... args) 新字符串使用本地语言环境，制定字符串格式和参数生成格式化的新字符串。
        //format(Locale locale, String format, Object... args) 使用指定的语言环境，制定字符串格式和参数生成格式化的字符串。

        concat
        String s = s1.concat("s");   //concat() 方法用于将指定的字符串参数连接到字符串上。
        //concat：将指定字符串连接到此字符串的结尾。如果参数字符串的长度为 0，则返回此 String 对象。
        //否则，创建一个新的 String 对象，用来表示由此 String，对象表示的字符序列和参数字符串表示的字符序列连接而成的字符序列。
        //+可以把任何类型的数据连接起来
        /*public String concat(String str) {
            int otherLen = str.length();
            if (otherLen == 0) {
                return this;
            }
            int len = value.length;
            char buf[] = Arrays.copyOf(value, len + otherLen);
            str.getChars(buf, len);
            return new String(buf, true);
        }*/
            
        replace
        System.out.println(s3.replace(char oldchar,char newchar));//转小写
        //意思将这个字符串中的所有的oldchar全部换成newchar，并返回一个新的字符串
        /*public String replace(char oldChar, char newChar) {
                if (oldChar != newChar) {
                    int len = value.length;
                    int i = -1;
                    char[] val = value; // avoid getfield opcode

                while (++i < len) {
                    if (val[i] == oldChar) {
                        break;
                    }
                }
                if (i < len) {
                    char buf[] = new char[len];
                    for (int j = 0; j < i; j++) {
                        buf[j] = val[j];
                    }
                    while (i < len) {
                        char c = val[i];
                        buf[i] = (c == oldChar) ? newChar : c;
                        i++;
                    }
                    return new String(buf, true);
                }
            }
                return this;
          }*/

        matches
        System.out.println(s1.matches("{d}"));//和正则表达式匹配
        //String的matches()方法,split()方法中使用正则表达式.
        /*
          public boolean matches(String regex) {
            return Pattern.matches(regex, this);
         }
         */

        join
        System.out.println(s1.join(A (String), B (String[])));//和正则表达式匹配
        /*
        String.Join 方法 (A (String), B (String[]));
        在指定 String 数组B的每个元素之间串联指定的分隔符 A，从而产生单个串联的字符串
        string [] tmpStr={abc,def,ghi};
        string jn = string.Join(“-“, tmpStr);
        此时jn=”abc-def-ghi”;
        */

        intern
        System.out.println(s1.intern());//内容较多，篇幅较大，单都更新
        /*
          public native String intern();
        */

        hashCode
        System.out.println(s1.hashCode());
        //在String类中有个私有实例字段hash表示该串的哈希值，在第一次调用hashCode方法时，字符串的哈希值被计算并且赋值给hash字段，
        //之后再调用hashCode方法便可以直接取hash字段返回。
        //hashCode()方法如下：
        /*public int hashCode() {
            int h = hash;
            if (h == 0 && value.length > 0) {
                char val[] = value;

                for (int i = 0; i < value.length; i++) {
                    h = 31 * h + val[i];
                }
                hash = h;
            }
            return h;
        }*/
        //String类中的hashCode计算方法还是比较简单的，就是以31为权，每一位为字符的ASCII值进行运算，用自然溢出来等效取模。
        //哈希计算公式可以计为s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        //关于为什么取31为权，主要是因为31是一个奇质数，所以31*i=32*i-i=(i<<5)-i，这种位移与减法结合的计算相比一般的运算快很多。
        //字符串哈希可以做很多事情，通常是类似于字符串判等，判回文之类的。
        //但是仅仅依赖于哈希值来判断其实是不严谨的，除非能够保证不会有哈希冲突，通常这一点很难做到。
   //就拿jdk中String类的哈希方法来举例，字符串"gdejicbegh"与字符串"hgebcijedg"具有相同的hashCode()返回值-801038016，并且它们具有reverse的关系。
        //这个例子说明了用jdk中默认的hashCode方法判断字符串相等或者字符串回文，都存在反例。
        //

    }





}
