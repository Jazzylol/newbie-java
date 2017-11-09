package com.coldridge.valley.java.grammar.keyword;


/**
 * 运算符号的区别  & | ^ !
 *
 * && || ， 尤其在判断条件里 if(a & b )和 if(a && b)区别，类似的还有 if(a | b ) if(a || b)
 */
public class Learn3 {


    public static void main(String[] args) {
        test1();
        test2();

    }

    private static void test2() {

        // && 和 ||

        boolean conditionOne = true;
        boolean conditionTwo = true;
        boolean conditionThree = false;


        /**
         * 以下两个判断都是需要满足2个条件才会执行 if里面代码
         * & 和 && 的区别在于，如果conditionOne(第一个条件）如果是false，那么&会继续判断conditionTwo是不是true，而 && 则不会再判断conditionTwo是不是true了。
         * 具体的测试代码 见 i++ 和 ++i的区别
         */

        if (conditionOne & conditionTwo) {
            System.out.println("11");
        }

        if (conditionOne && conditionTwo) {
            System.out.println("2");
        }

        /**
         *
         * 类似 &和&& 一样， 下面2个判断都是只要有一个true那么就会执行代码
         *  | 表示如果第一个条件是true了，他还会继续检查第二个条件，而 ||则是 如果第一个条件是true了，第二个条件就不会检查了
         * 具体的测试代码 见 i++ 和 ++i的区别
         */

        if (conditionOne | conditionThree) {
            System.out.println("|");
        }

        if (conditionOne || conditionThree) {
            System.out.println("||");
        }




    }

    /**
     * 测试  &  |  ^ !
     * 逻辑运算符
     */
    private static void test1() {
        //&
        System.out.println("测试逻辑运算符");
        System.out.println("3 & 4 = " + (3 & 4));
        // |
        System.out.println("3 | 4 = " + (3 | 4));
        // ^
        System.out.println("3 ^ 4 = " + (3 ^ 4));
        // !
        System.out.println("!true = " + !true);
        System.out.println("测试逻辑运算符 结束");

    }
}
