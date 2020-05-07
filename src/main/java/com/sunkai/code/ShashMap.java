package com.sunkai.code;

import com.sunkai.pojo.Good;
import com.sunkai.pojo.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ShashMap
 * @Description 手写hashmap
 * @Author sunkai
 * @Date 2020/4/7 14:41
 * @Version 1.0
 **/
public class ShashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap<>();

        Good product = new Good();
        int hashcode = product.hashCode();
        System.out.println(hashcode);
    }
}
