package com.sunkai.demotest;

import com.sunkai.ListFactory;
import com.sunkai.pojo.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/7 11:17
 * @Version 1.0
 **/
public class StreamTest {
    public static void main(String[] args) {
        ListFactory factory = new ListFactory();
        List<Product> productList = factory.getProductList();
        Map<Integer, Long> collect = productList.stream().collect(Collectors.groupingBy(Product::getProductId, Collectors.counting()));
        System.out.println(collect);

        List<Integer> areaApplyIds = new ArrayList<>();
        areaApplyIds.add(1);
        areaApplyIds.add(2);
        areaApplyIds.add(3);
        List<Integer> collect2 = areaApplyIds.stream().filter(x -> x != 2).collect(Collectors.toList());
        collect2.stream().forEach(x -> {
            System.out.println(x);
        });
        Map<Integer, Long> collect1 = areaApplyIds.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(collect1);
    }
}
