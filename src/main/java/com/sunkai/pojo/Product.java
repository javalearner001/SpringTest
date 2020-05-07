package com.sunkai.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName Product
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/7 11:17
 * @Version 1.0
 **/
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = -3807384138763534362L;

    private String productName;
    private int productId;
    private BigDecimal count;
}
