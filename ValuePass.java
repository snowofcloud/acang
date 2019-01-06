package com.spring.boot.mybatis.server;

/**
 * @auther xuxq
 * @date 2019/1/6 14:47
 */
public class ValuePass {
    String str = new String("hello world");
    char[] charS = {'a','3','R'};
    public void change(String str, char[] ch){//char[] ch 和char ch[]都可以的？ why？？？
        str = "wetytj";
        ch[1] = 'E';
    }
    //因为String是不可变类且为值传递，而ch[]是引用传递，所以方法中的str = "ok",相当于重新创建一个对象并没有改变实参str的值，
    //数组是引用传递，直接改变，

    public static void main(String[] args) {
        ValuePass valuePass = new ValuePass();
        valuePass.change(valuePass.str, valuePass.charS);

        System.out.print(valuePass.str + " and ");
        System.out.println(valuePass.charS);
        //输出结果：hello world and aER
    }
    //1.值传递是指一个参数传递给一个函数时，函数接收的是原始值得副本。
    //2.引用传递是一个参数传递给一个函数时，函数接收的是原始值的地址。
    //3.java应用程序中，有且仅有一种传递，即值传递。
    //4.对象是按引用传递的。

   /* 一、基本类型和引用类型的理解：{
        Java中的数据类型分为两种为基本类型和引用类型。
        1、/基本类型的变量保存原始值，所以变量就是数据本身。
			    常见的基本类型：byte,short,int,long,char,float,double,Boolean,returnAddress。
        2、/引用类型的变量保存引用值，所谓的引用值就是对象所在内存空间的“首地址值”，通过对这个引用值来操作对象。
			    常见的引用类型：类类型，接口类型和数组。
    }

    二、值传递和引用传递的理解：{
        1、值传递
		    在方法的调用过程中，实参把它的实际值传递给形参，此传递过程就是将实参的值复制一份传递到函数中，
            这样如果在函数中对该值（形参的值）进行了操作将不会影响实参的值。因为是直接复制，所以这种方式在传递大量数据时，运行效率会特别低下。
        2、引用传递
		    引用传递弥补了值传递的不足，如果传递的数据量很大，直接复过去的话，会占用大量的内存空间，而引用传递就是将对象的地址值传递过去，函数接收的是原始值的首地址值。
            在方法的执行过程中，形参和实参的内容相同，指向同一块内存地址，也就是说操作的其实都是源数据，所以方法的执行将会影响到实际对象。*/



}
