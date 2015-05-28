package com.alipay.yihang.sofamvc;

import java.lang.reflect.Field;

/**
 * Created by damon_lin on 15/5/26.
 */
public class Checker {

    ErrorWrapper wrapper = new ErrorWrapper("");
    Object DO;
    Class cls;

    public Checker(Object DO) {
        this.DO = DO;
        this.cls = this.DO.getClass();
    }

    public ErrorWrapper getWrapper() {
        return wrapper;
    }

    public Object getVal(String arg) {
        try {
            Field field = this.cls.getDeclaredField(arg);
            field.setAccessible(true);
            Object fieldArg = field.get(DO);
            return fieldArg;
        } catch (NoSuchFieldException e) {
            System.out.println(e);
            // todo
        } catch (IllegalAccessException e) {
            System.out.println(e);
            //todo
        } finally {

        }
        return null;
    }

    /**
     * Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNotNull(String... args){

        for (String arg : args) {
            if (getVal(arg) == null)
                wrapper.add(arg + " must not null");
        }
        return wrapper;
    }

    /**
     * Must Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkMustNull(String... args){
        for (String arg : args) {
            if (getVal(arg) != null)
                wrapper.add(arg + " must be null");
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
    public ErrorWrapper checkBoth(String... args){
        if ((getVal(args[0]) != null && getVal(args[1]) == null) || (getVal(args[0]) == null && getVal(args[1]) != null))
            wrapper.add(args[0] + " and " + args[1] + " must both be null or both not null");
        return wrapper;
    }

    /**
     * A Not Null Or B Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkOr(String... args) {
        if ((getVal(args[0]) == null && getVal(args[1]) == null))
            wrapper.add(args[0] + " or " + args[1] + " must be not null ");
        return wrapper;
    }

    /**
     * Y Y => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYYNotNull(String... args) {

        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="Y"&&getVal(b)=="Y"&&getVal(c)==null)
            wrapper.add(a+" and "+b+"are both Y,  the "+c+" must be not null ");
        return wrapper;
    }

    /**
     * Y N => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYNNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="Y"&&getVal(b)=="N"&&getVal(c)==null)
            wrapper.add(a+" is "+" Y "+b+" is N,  the "+c+" must be not null ");
        return wrapper;
    }

    /**
     * N Y => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNYNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="N"&&getVal(b)=="Y"&&getVal(c)==null)
            wrapper.add(a+" is "+" N "+b+" is N,  the "+c+" must be not null ");
        return wrapper;
    }

    /**
     * N N => Not Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="N"&&getVal(b)=="N"&&getVal(c)==null)
            wrapper.add(a+" is "+" N "+b+" is N,  the "+c+" must be not null ");
        return wrapper;
    }


    /**
     * Y Y =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYYNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="Y"&&getVal(b)=="Y"&&getVal(c)!=null)
            wrapper.add(a+" is "+" Y "+b+" is Y,  the "+c+" must be null ");
        return wrapper;
    }

    /**
     * Y N =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYNNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="Y"&&getVal(b)=="N"&&getVal(c)!=null)
            wrapper.add(a+" is "+" Y "+b+" is N,  the "+c+" must be null ");
        return wrapper;
    }


    /**
     * N Y =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNYNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="N"&&getVal(b)=="Y"&&getVal(c)!=null)
            wrapper.add(a+" is "+" N "+b+" is Y,  the "+c+" must be null ");
        return wrapper;
    }

    /**
     * N N =>  Null Rule
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="N"&&getVal(b)=="N"&&getVal(c)!=null)
            wrapper.add(a+" is "+" N "+b+" is N,  the "+c+" must be null ");
        return wrapper;
    }


}
