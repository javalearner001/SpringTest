package com.sunkai.jsontest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sunkai.ListFactory;
import com.sunkai.pojo.Product;

import java.util.List;

/**
 * @ClassName FastJson
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/17 9:52
 * @Version 1.0
 **/
public class FastJson {
    public static void main(String[] args) {
        ListFactory factory = new ListFactory();
        List<Product> productList = factory.getProductList();

        JSONArray array= JSONArray.parseArray(JSON.toJSONString(productList));
        System.out.println(array);
        String aa = array.toString();
        System.out.println(aa);


        List<Product> list = JSONObject.parseArray(aa, Product.class);
        System.out.println(JSON.toJSONString(list));

    }
}
