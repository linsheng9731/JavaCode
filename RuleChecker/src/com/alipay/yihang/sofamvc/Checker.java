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
     * Not Null Rule 1
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
     * Must Null Rule 2
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
     * Ignore Rule 3
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkIgnore(String... args) {
        return wrapper;
    }

    /**
     * Both Null or Both ont Null Rule 4
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
     * A Not Null Or B Not Null Rule 5
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
     * Y  => Not Null Rule 6
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYNotNull(String... args) {

        String a = args[0],b = args[1];
        if (getVal(a)=="Y"&&getVal(b)==null)
            wrapper.add(a+" is Y "+ "the "+b+" must be not null ");
        return wrapper;
    }


    /**
     * N  => Not Null Rule 7
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNMustNull(String... args) {

        String a = args[0],b = args[1];
        if (getVal(a)=="N"&&getVal(b)!=null)
            wrapper.add(a+" is N "+ "the "+b+" must be null ");
        return wrapper;
    }

    /**
     * Null  => Both Null Rule 8
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNullBothNull(String... args) {

        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)==null&&(getVal(b)!=null||getVal(c)!=null))
            wrapper.add(a+" is null "+ "so "+"the "+b+" and "+c+" must both be null ");
        return wrapper;
    }

    /**
     * Not Null  => Or Not Null Rule 9
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNotNullOrNotNull(String... args) {

        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)!=null&&(getVal(b)!=null||getVal(c)!=null))
            wrapper.add(a+" is not null "+ "so "+"one of the "+b+" and "+c+" must  be not null ");
        return wrapper;
    }

    /**
     * Y Y => Not Null Rule 10
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
     * Y N => Not Null Rule 11
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
     * N Y => Not Null Rule 12
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
     * N N => Not Null Rule 13
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
     * Y Y =>  Null Rule 14
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
     * Y N =>  Null Rule 15
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
     * N Y =>  Null Rule 16
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
     * N N =>  Null Rule 17
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

    /**
     * N Null =>  Not Null Rule 18
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNullNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2];
        if (getVal(a)=="N"&&getVal(b)==null&&getVal(c)==null)
            wrapper.add(a+" is "+" N "+b+" is null,  the "+c+" must not be  null ");
        return wrapper;
    }

    /**
     * Y Y => Or Not Null Rule 19
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkYYOrNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2],d = args[3];
        if (getVal(a)=="Y"&&getVal(b)=="Y"&&(getVal(c)==null&&getVal(d)==null))
            wrapper.add(a+" is "+" Y "+b+" is Y, one of the "+c+" and "+d+" must not be null ");
        return wrapper;
    }


    /**
     * N Null => Or Not Null Rule 20
     *
     * @param args
     * @return
     */
    public ErrorWrapper checkNNullOrNotNull(String... args) {
        String a = args[0],b = args[1],c = args[2],d = args[3];
        if (getVal(a)=="N"&&getVal(b)==null&&(getVal(c)==null&&getVal(d)==null))
            wrapper.add(a+" is "+" N "+b+" is null, one of the "+c+" and "+d+" must not be null ");
        return wrapper;
    }
}
