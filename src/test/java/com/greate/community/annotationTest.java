package com.greate.community;

public class annotationTest extends Object{
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public static  void test(){
        System.out.println("123");
    }

    public static  void test1(){
        System.out.println("123");
    }

    public static void main(String[] args) {
        test();
        test1();

    }
}
