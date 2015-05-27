package com.alipay.yihang.sofamvc;

import java.lang.reflect.Field;

/**
 * Created by damon_lin on 15/5/26.
 */
public class Checker {

    ErrorWrapper wrapper = new ErrorWrapper("");
    Object DO;
    Class cls;

    public Checker(Object DO){
        this.DO = DO;
        this.cls = this.DO.getClass();
    }
    public ErrorWrapper getWrapper(){
        return wrapper;
    }
    public Object getVal(String arg) throws NoSuchFieldException, IllegalAccessException {

        Field field =  this.cls.getDeclaredField(arg);
        field.setAccessible(true);
        Object fieldArg = field.get(DO);
        return fieldArg;
    }

    /**
     * Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNotNull(String... args) throws NoSuchFieldException, IllegalAccessException {

        for (String arg : args) {
            if (getVal(arg) == null)
                 wrapper.add(arg+" must not null");
        }
        return wrapper;
    }

    /**
     * Must Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkMustNull(String... args)throws NoSuchFieldException, IllegalAccessException {
        for (String arg : args) {
            if (getVal(arg) != null)
                 wrapper.add(arg+" must be null");
        }
        return wrapper;
    }

    /**
     * Ignore Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkIgnore(String... args) {
        return wrapper;
    }

    /**
     * Both Null or Both ont Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkBoth(String... args)throws NoSuchFieldException, IllegalAccessException {
        if ((getVal(args[0])!= null && getVal(args[1]) == null) || (getVal(args[0]) == null && getVal(args[1]) != null))
             wrapper.add(args[0]+" and "+args[1]+" must both be null or both not null");
        return wrapper;
    }

    /**
     * A Not Null Or B Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkOr(String... args) {
        if ((args[0] == null && args[1] == null))
             wrapper.add(args[0]+" or "+args[1]+" must be not null ");
        return wrapper;
    }

    /**
     * Y Y => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYYNotNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }

    /**
     * Y N => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYNNotNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }

    /**
     * N Y => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNYNotNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }

    /**
     * N N => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNNotNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }


    /**
     * Y Y =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYYNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }

    /**
     * Y N =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYNNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }


    /**
     * N Y =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNYNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }

    /**
     * N N =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNNull(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        return wrapper;
    }


}
