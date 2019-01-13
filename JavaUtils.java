package com.spring.boot.mybatis.server;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @auther xuxq
 * @date 2019/1/6 1:09
 */
public class JavaUtils {

    //Java日期处理核心类之Calendar详解
    //Java中解决日期时间的类。JDK1.1以前我们一般运用java.util.Date这个类来解决日期时间,
    //可是自JDK1.1之后发布了Calendar这个抽象类来专门用于解决日期时间。

    //Calendar 类是1个抽象类，它为特殊瞬间与一组诸如 YEAR MONTH DAY_OF_MONTH HOUR 等日历字段之间的变换出示了某些办法，
    // 并为操作日历字段（比如得到下星期的日期）提供了某些办法。

    //作为抽象类,他自身不可以立即实例化,程序必须创建Calendar子类的实例,Java自身提供了一个CregorianCalendar类,
    // 一个代表格里高利日历的子类,它代表了通常常说的公历。

    //Calendar类中也有before，after，c om pa r e To等方法，用法与Date类的类似，只是现在推荐用Calendar类操作日期。
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //解析日期
        Date parse = sdf.parse(next);//2019-01-13

        int i = scanner.nextInt();
        Date date = nextSign(parse, i);
        System.out.println(date);


    }

    private static Date nextSign(Date date, int year){
        Date nextDate = null;
        Calendar c = Calendar.getInstance();
        //将输入的日期设置为日历的时间
        c.setTime(date);

        //年份挪位
        c.add(Calendar.YEAR,year);
        //减二个月
        c.add(Calendar.MONDAY,-2);

        //判断周末
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_MONTH,1);
        }
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            c.add(Calendar.DAY_OF_MONTH,2);
        }

        //将日历转为日期
        nextDate = c.getTime();
        return nextDate;
    }
}
