package com.sunkai;

import java.util.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/14 17:20
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        String productCodes = "1348212,1350008,1352236,1350010,1352237,1352419,1352431,1355688";

        List<String> stringList = Collections.singletonList(productCodes);

        String[] split = productCodes.split(",");
        List<String> stringList1 = Arrays.asList(split);
        stringList1.forEach( x -> {
            System.out.println(x);
        });
        for (int i = 0 ; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.size());
    }
}
