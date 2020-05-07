package com.sunkai.code;

import com.alibaba.fastjson.JSON;
import com.sunkai.ListFactory;
import com.sunkai.pojo.Product;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/13 9:26
 * @Version 1.0
 **/
public class Sort {
    public static void main(String[] args) {
        ListFactory factory = new ListFactory();
        List<Product> productList = factory.getProductList();
        System.out.println("排序前："+JSON.toJSONString(productList));
        lambdaSort2(productList);

    }

    public static void collectionSort(List<Product> productList){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getCount().compareTo(o1.getCount());
            }
        });
        System.out.println("Collections.sort排序后："+ JSON.toJSONString(productList));
    }
    public static void collectionSortReverse(List<Product> productList){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getProductId() - o1.getProductId();
            }
        });
        System.out.println("Collections.sort排序后："+ JSON.toJSONString(productList));
    }

    public static void lambdaSort(List<Product> productList){

        List<Product> collect = productList.stream().sorted(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductId() - o2.getProductId();
            }
        }).collect(Collectors.toList());
        System.out.println("lambda排序后："+ JSON.toJSONString(collect));
    }

    public static void lambdaSort2(List<Product> productList){

        List<Product> collect = productList.stream().sorted((x,y) -> x.getProductId() - y.getProductId()).collect(Collectors.toList());
        productList.stream().sorted(Comparator.comparing(Product::getProductId));
        productList.stream().sorted(Comparator.comparing(Product::getProductId).reversed());
        System.out.println("lambda排序后："+ JSON.toJSONString(collect));
    }
}
