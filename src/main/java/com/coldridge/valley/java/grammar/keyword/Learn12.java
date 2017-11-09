package com.coldridge.valley.java.grammar.keyword;


/**
 * break，continue的使用  break a，continue a分别如何使用（for循环可以定义名称，使用break，continue 跳出制定的循环，默认只跳出一层循环）
 */
public class Learn12 {


    public static void main(String[] args) {
        test();
    }

    private static void test() {


        /**
         * 嵌套循环 循环可以起名字
         */

        a:
        for (int i = 1; i < 1000; i++) {


            b:
            for (int j = 1; j < 100; j++) {


                /**
                 * 可以执行跳出名字的循环，默认跳出当前循环
                 */

                if (j == 40) {
                    break ; //默认跳出 b循环
                }
                if (j == 40) {
                    break b;//指定跳出 b循环
                }
                if (j == 40) {
                    break a;//指定跳出a循环
                }

                if (j == 40) {
                    continue  ; //默认继续 b循环
                }
                if (j == 40) {
                    continue b;//指定继续 b循环
                }
                if (j == 40) {
                    continue a;//指定继续a循环
                }

                if (j == 40) {
                    return; // 直接结束整个方法  结束test()方法
                }

            }
        }


    }


}
