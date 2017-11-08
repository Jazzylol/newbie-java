package com.coldridge.valley.java语法基础.关键字;



/**
 * 三元运算符
 */
public class Learn7 {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {


        /**
         * 三元运算符 貌似跟python一样
         *  a = b?c:d
         *  b如果是true 那么 把c赋值给a即 a=c ，否则 a= d
         */


        System.out.println(true ? 100 : -100);
        System.out.println(false ? "100" : "-100");


    }

}
