package com.sunkai;

import com.sunkai.pojo.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListFactory
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/13 9:42
 * @Version 1.0
 **/
public class ListFactory {

    Product product1 = new Product();
    Product product2 = new Product();
    Product product3 = new Product();
    Product product4 = new Product();
    Product product5 = new Product();
    List<Product> productList = new ArrayList<>();

    public ListFactory(){
        product1.setProductId(1);
        product1.setCount(new BigDecimal("3.655"));
        product1.setProductName("one 商品");
        product2.setProductId(2);
        product2.setCount(new BigDecimal("5.699"));
        product2.setProductName("two 商品");
        product3.setProductId(5);
        product3.setCount(new BigDecimal("6.655"));
        product3.setProductName("three 商品");
        product4.setProductId(4);
        product4.setCount(new BigDecimal("7.699"));
        product4.setProductName("four 商品");
        product5.setProductId(4);
        product5.setCount(new BigDecimal("8.655"));
        product5.setProductName("five 商品");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }



    public List<Product> getProductList(){
        return productList;
    }
}
