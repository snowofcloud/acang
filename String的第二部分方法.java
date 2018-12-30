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
             //1.2.1 按顺序
               //String s = String.format("Hello %s%s%s", "jerry-", "li", ",welcome!");
            //1.2.2 按索引
              //String s = String.format("Hello %2$s%3$s%1$s", "li-", "heng-", "jie");
        //2 对整数格式化
              //int n2 = 9999999;
              //System.out.printf("%+(,d %n", n2);
           //  - 表示 在最小宽度内左对齐,不可以与0标识一起使用。
           //  0 表示 若内容长度不足最小宽度
           //  + 表示 结果总包含一个+或-号。
           // 空格 表示    正数前加空格 
           //  ,       只用与十进制
           //  (      若结果为负数
       //3 对浮点数格式化
           //double n = 3.1415926;
           //String s = String.format("%f %n", num);
      //4 对日期、时间格式化
           //对日期格式化的时候不能像对数字那样多种格式对应一个数字，分为日期格式化及时间格式化两部分，如果希望格式化之后的格式是：     
          // 2017-01-13 12:05:30,需要先格式化日期，然后再格式化时间。    
          //    Date date = new Date();
           //   String dateFormat = String.format("%tF %tT ", date, date);
           //   System.out.println(dateFormat);
       //底层源码
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
        如下所示：string [] tmpStr={abc,def,ghi};
        string jn = string.Join(“-“, tmpStr);
        此时jn=”abc-def-ghi”;
        */

        intern
        System.out.println(s1.intern());//内容较多，篇幅较大，单都更新
        /*在String类中，intern方法是一个本地方法，intern方法会在运行时常量池中查找是否存在内容相同的字符串，
          如果存在则返回指向该字符串的引用，如果不存在，则会将该字符串入池，并返回一个指向该字符串的引用。
          
          jdk源码中对intern方法的详细解释。简单来说就是intern用来返回常量池中的某字符串，如果常量池中已经存在该字符串，
          则直接返回常量池中该对象的引用。否则，在常量池中加入该对象，然后 返回引用。
          
          String设计的初衷：
              1. 字符串常量池的需要。字符串常量池的诞生是为了提升效率和减少内存分配。可以说我们编程有百分之八十的时间在处理字符串，
              而处理的字符串中有很大概率会出现重复的情况。正因为String的不可变性，常量池很容易被管理和优化。
              2. 安全性考虑。正因为使用字符串的场景如此之多，所以设计成不可变可以有效的防止字符串被有意或者无意的篡改。
              从java源码中String的设计中我们不难发现，该类被final修饰，同时所有的属性都被final修饰，在源码中也未暴露任何成员变量的修改方法。
              （当然如果我们想，通过反射或者Unsafe直接操作内存的手段也可以实现对所谓不可变String的修改）。
              3. 作为HashMap、HashTable等hash型数据key的必要。因为不可变的设计，jvm底层很容易在缓存String对象的时候缓存其hashcode，
              这样在执行效率上会大大提升。  
        */
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
