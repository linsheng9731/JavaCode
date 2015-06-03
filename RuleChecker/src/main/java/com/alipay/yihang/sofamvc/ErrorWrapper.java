package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/26.
 */
public class ErrorWrapper {

    /* Rcord error info */
    private  String info;

    public ErrorWrapper(String info){
        this.info = info;
    }

    public ErrorWrapper(){
        ;
    }


    public String toString(){
        return info;
    }

    public ErrorWrapper add(String info){
        this.info = this.info+info+";";
        return this;

    }

}
