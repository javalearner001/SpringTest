package com.sunkai.spring;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author sunkai
 * @Date 2020/1/2 9:49
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("0");

        System.out.println(a.compareTo(BigDecimal.ZERO));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date()); //需要将date数据转移到Calender对象中操作
        calendar.add(Calendar.DATE,7);//把日期往后增加n天.正数往后推,负数往前移动
        System.out.println(new Date());
        System.out.println(calendar.getTime());
    }
}
