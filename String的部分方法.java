package com.spring.boot.mybatis.server.entity;

import java.util.Locale;

/**
 * @auther xuxq
 * @date 2018/12/25 21:38
 */
public class Bitch {

    public static void main(String[] args) {
        //字符串的length、isEmpty、charAt、equalsIgnoreCase、startsWith、endsWith、
               //toLowerCase、toUpperCase、substring、indexOf、lastIndexOf、toCharArray、getBytes;
        StringBuilder sb = new StringBuilder();//concat  replace   matches contains split join trim toString  format valueOf copyValueOf intern

        String s1 = "low_salary";
        String s2 = "low";
        String s3 = "LOW_SALARY";
        String s4 = "low_salary";

        System.out.println(s1.length());//字符串长度-------------底层方法如下，下同。
       /* public int length(){
            return value.length;
        }*/
        System.out.println(s1.isEmpty());//判断是否为空
        /*public boolean isEmpty(){
            return value.length == 0;
        }*/

        System.out.println(s1.charAt('s'));//判断字符串中某个字符的索引
        /*public char charAt(int index){
            if ((index<0)||(index > value.length)){
                throw new StringIndexOutOfBoundsException(index);
            }
            return value[index];
        }*/
        System.out.println(s1.equalsIgnoreCase(s2));//判断两个字符串是否相等，忽略大小写
        /*public boolean equalsIgnoreCase(String anotherString) {
            return (this == anotherString) ? true
                    : (anotherString != null)
                    && (anotherString.value.length == value.length)
                    && regionMatches(true, 0, anotherString, 0, value.length);
        }*/
        System.out.println(s1.startsWith("l"));//判断s1是否以l开头
       /* public boolean startsWith(String prefix) {
            return startsWith(prefix, 0);
        }*/
        System.out.println(s1.endsWith("y"));//判断s1是否以y结尾
        /*public boolean endsWith(String suffix) {
            return startsWith(suffix, value.length - suffix.value.length);
        }*/
        System.out.println(s1.toUpperCase());//转大写
        /*public String toUpperCase() {
            return toUpperCase(Locale.getDefault());
        }*/
        System.out.println(s3.toLowerCase());//转小写
        /*public String toLowerCase() {
            return toLowerCase(Locale.getDefault());
        }*/
        System.out.println(s1.substring(0,2));//截取包括开始的，不包括结束的字符
        /*public String substring(int beginIndex, int endIndex) {
            if (beginIndex < 0) {
                throw new StringIndexOutOfBoundsException(beginIndex);
            }
            if (endIndex > value.length) {
                throw new StringIndexOutOfBoundsException(endIndex);
            }
            int subLen = endIndex - beginIndex;
            if (subLen < 0) {
                throw new StringIndexOutOfBoundsException(subLen);
            }
            return ((beginIndex == 0) && (endIndex == value.length)) ? this
                    : new String(value, beginIndex, subLen);
        }*/
       System.out.println(s1.indexOf("s"));//返回字符串中某个字符的索引
        /*public int indexOf(String str) {
            return indexOf(str, 0);
        }*/
        System.out.println(s1.lastIndexOf("y"));//返回最后一个字符的索引
        /*public int lastIndexOf(String str) {
            return lastIndexOf(str, value.length);
        }*/
        char[] chars = s1.toCharArray();
        System.out.println(chars[1]);//将字符串转为字符数组
        /*public char[] toCharArray() {
            // Cannot use Arrays.copyOf because of class initialization order issues
            char result[] = new char[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            return result;
        }*/
        byte[] bytes = s1.getBytes();
        System.out.println(bytes[1]);//转为字节数组
        /*public byte[] getBytes() {
            return StringCoding.encode(value, 0, value.length);
        }*/

    }





}
