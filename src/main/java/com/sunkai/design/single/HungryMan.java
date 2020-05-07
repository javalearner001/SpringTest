package com.sunkai.design.single;

/**
 * @ClassName HungryMan
 * @Description 饿汉式
 * @Author sunkai
 * @Date 2020/4/10 16:55
 * @Version 1.0
 **/
public class HungryMan {

    private static final HungryMan hungryMan = new HungryMan();

    public HungryMan getInstance(){
        return hungryMan;
    }

    private HungryMan(){

    }
}
