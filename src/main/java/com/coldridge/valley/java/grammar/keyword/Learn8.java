package com.coldridge.valley.java.grammar.keyword;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组定义的语法 ,三元数组的定义语法
 */
public class Learn8 {

    public static void main(String[] args) {
        test();
    }

    private static void test() {

        /**
         * 定义数组 ,int 表示数组里装的元素的类型，类似的还可以使用 其他基本数据类型或者包装类或者对象来定义数组类型
         */
        int arr[] = new int[10];
        //或者
        int[] arr2 = new int[20];
        //类似的还有
        int[] arr3 = {1, 2, 3};

        /**
         * 二维数组 二维数组其实就是一维数组，然后里面的每个元素又是一个数组
         * 当然还有三维四维。。等等
         */
        int[][] arr4 = new int[10][1];
        //或者
        int[][] arr5 = {{1, 2,}, {3, 5}, {4, 4}};
        System.out.println(arr5.toString());

        /**
         * 集合的定义
         * 集合和数组都是装元素的 异同点在于
         * 集合是可以扩展的（内部自动扩展）
         * 数组是不可以扩展的，在定义一开始久已经限制了数组的长度。集合在定义之初也可以输入长度大小，但是后期可自动扩展
         * 集合内部只能装对象，不可以装基础数据类型（int double等）
         * 数组可以装对象，也可以装基本数据类型
         * 集合可以有很多api 类似 list.add  remove等
         * 数据基本没有api,只有 length这种获取长度的api
         */
        List<String> list = new ArrayList<String>();

        list.add("111");
        list.remove("222");
        //遍历
        for (String s : list) {
            System.out.println(s);
        }
    }


}
