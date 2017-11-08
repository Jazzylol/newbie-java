package com.coldridge.valley.java语法基础.关键字;


/**
 * 位运算符  << ，>>，<<<，>>>区别
 *
 * https://www.cnblogs.com/hongten/p/hongten_java_yiweiyunsuangfu.html
 */
public class Learn4 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        /**
         * << 表示数字转成 二进制左移
         * <<< 无符号左移 ( 不存在无符号右移！ 错误写法）
         * >> 右移
         * >>> 无符号右移
         *
         * 7 二进制是 111
         * 左移一位是  1110
         * 无符号左移是  1110
         * 右移
         */

        System.out.println(7 << 1 );
//        System.out.println(7 <<< 1 );
        System.out.println(7 >> 1 );
        System.out.println(7 >>> 1 );


    }
}
