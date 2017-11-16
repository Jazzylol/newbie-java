package com.coldridge.valley.java.grammar.object;


/**
 * 变量的作用范围，成员变量和局部变量的区别
 */
public class Learn7 {


    private static Integer a  =1;
    private Integer d = 4;

    public static void main(String[] args) {
        Integer b = 2;

        for(int i = 0; i<100;i++) {

            Integer c = 3;
        }

    }


    /**
     * a被称为类变量，因为是静态的，所以隶属于类
     * d被称为成员变量，字面理解就是 一个对象的内部的一个成员
     * b,c都可以被称为局部变量，但是他们的作用范围又不同
     * b的作用范围是整个main函数
     * c的作用范围只在循环之中
     *
     *
     *
     * 合理的定义变量，合理的使用变量
     * java中一般是只定义最大够用的范围即可，不建议定义过多的 类变量和成员变量
     *
     */




}
