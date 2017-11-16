package com.coldridge.valley.java.grammar.object;

/**
 * 匿名对象是什么？为什么存在匿名对象，如何定义匿名对象，如何使用匿名对象
 */
public class Learn6 {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        /**
         * 正常我们创建对象的方式都是 TestAnony one = new TestAnony();
         * 但是实际上我们有时候 该对象创建出来就是为了使用一次一个方法,如果再用一个引用来接收  new出来的对象感觉有点浪费
         * 所以有了匿名对象
         *
         * new TestAnony(); 这个就称为匿名对象
         * TestAnony one = new TestAnony(); 这个就是普通对象
         * 下面展示使用方法
         */

        //使用一次 eat方法  正常对象使用
        TestAnony one = new TestAnony();
        one.eat();


        //使用匿名对象,区别在于 new出来的对象因为没有变量接受所以 只能使用一次，使用完就没法再使用了
        new TestAnony().eat();

        /**
         * 匿名对象的使用方法就是
         * 1、需要对象这个载体
         * 2、只需要使用一次 后面不再使用
         *
         * 好处是 不需要jvm额外再分配内存用来接收创建出来的变量
         */

        /**
         * 因为java存在继承 多态所以匿名内部类还有一种特殊方法
         * 因为 接口/抽象类 是不可以直接new的,但是如果作为抽象类使用可以写成下面这样
         */

        //正常如果是类实现了接口，使用匿名内部类还是像上面一样
        new TestImplment().sayHello();
        //但是如果也可以像下面的写法,new 接口，然后在方法里写实现。
        new TestAnonyInterface() {
            @Override
            public void sayHello() {
                System.out.println("我是匿名内部类实现");
            }
        }.sayHello();

        /**
         * 后期说到线程的时候 会见到N多类似的写法 ，都是为了不多写一个现实类，直接new 接口，写出对应实现即可
         */

    }


    static class TestAnony{

        void eat() {
            System.out.println("eat");
        }



    }

    /**
     * 接口 已经定义好了一个方法，实现该接口的类需要实现该方法
     */
     interface TestAnonyInterface {
        void sayHello();
    }

    static class TestImplment implements TestAnonyInterface {
        @Override
        public void sayHello() {
            System.out.println("我实现了 接口");
        }
    }

}

