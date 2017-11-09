package com.coldridge.valley.java.grammar.keyword;


/**
 * 重载和覆盖（复写）的区别 。 Overridge 和 overload
 */
public class Learn13 {


    public static void main(String[] args) {
        test();
    }

    private static void test() {

        Father f = new Father();
        f.methodA("11");


        Son s = new Son();
        s.methodA("sss");
        s.methodA(199L);


        /**
         * 对于 类Father 和Son 来说  methodA(String) 是复写，Son类复写了 Father类中 methodA这个方法
         * 复写的要求是 除了实现啥都要一样，返回值,参数个数，参数类型全部都要一样
         * 对于Son类 methodA(Long）重载了 method(String)
         * 重载只要求方法名一样即可，方法参数不同，个数不同 返回值不同权限不同都可以
         *
         * @override表示 复写的标识符，没太大意义，因为methodA(String)是重写，所以可以放在该方法上
         * 但是如果放在methodA(Long)上面，就会报错，是因为methodA(Long)是重载方法并不是重写父类的方法
         *
         *
         *
         * 重写只发生在 父子类中
         * 重载 可以发生在本类 也可以发生在父子类
         */



    }



    static class Father{

        void methodA(String msg) {
            System.out.println("fahter methodA run");
        }
    }

    static class Son extends Father{


        @Override
        void methodA(String msg) {
            System.out.println("Son methodA  run");
        }

        void methodA(Long a) {
            System.out.println("son methodA  long run");
        }

    }

}
