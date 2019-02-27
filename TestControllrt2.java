package com.q8888.springboot.mybatis.server.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @auther xuxq
 * @date 2019/2/26 22:57
 */
public class TestControllrt2 {
    public static void main(String[] args) throws IOException {
        String str = new TestControllrt2().openFile();
        System.out.println(str);
    }
    public String openFile() throws IOException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("d:/a.txt");
            int ch = inputStream.read();
            System.out.println("aaa");
            return "step1";
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return "step2";
        }catch (IOException e) {
            System.out.println("io exception");
            return "step3";
        }finally{
            inputStream.close();
            System.out.println("finally block");
            //return "finally";
        }
        //加上return,return里的值会覆盖结果返回值，
        /*aaa
        finally block
        finally*/
        //不加return,正常返回结果返回值
       /* aaa
        finally block
        step1*/

    }
}
