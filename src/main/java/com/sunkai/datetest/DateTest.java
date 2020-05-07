package com.sunkai.datetest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DateTest
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/15 14:25
 * @Version 1.0
 **/
public class DateTest {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    public static void main(String[] args) {
        Date date = new Date(); // 获取当前的系统时间
        System.out.println("年份："+ date.getYear());

        Calendar calendar = Calendar.getInstance(); //获取当前的系统时间。
        String time = dateFormat.format(date);
        System.out.println(time);
        calendar.add(Calendar.DATE,1);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
