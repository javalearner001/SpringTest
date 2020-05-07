package com.sunkai.design.single;

/**
 * @ClassName LazyMan
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/10 16:57
 * @Version 1.0
 **/
public class LazyMan {

    private volatile static LazyMan lazyman = null;

    private LazyMan(){

    }

    public LazyMan getInstace(){
        if (lazyman == null){
            synchronized(LazyMan.class){
                if (lazyman == null){
                    lazyman = new LazyMan();
                }
            }
        }
        return lazyman;
    }
}
