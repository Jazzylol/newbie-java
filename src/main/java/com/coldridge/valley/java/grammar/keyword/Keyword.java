package com.coldridge.valley.java.grammar.keyword;

/**
 * 关键字
 */
public class Keyword {


    /**
     * 标识符，例如类的标识符是 class ，接口标识符  interface ,抽象类标识符 abstract class ,枚举标识符 enum ，静态类 static class
     */


    /**
     * 定义类  内部所有的方法都要有实现 ，写个空的大括号 叫做空实现
     */
    class TestClass{

        public void test() {

        }

    }

    /**
     * 定义接口  内部所有的方法必须没有实现，不能写大括号
     */
    interface TestInterface {
        /**
         * 接口里所有的方法，变量 默认都是 public abstract 的,可以默认不写
         */
        public abstract void test();
    }

    /**
     * 定义抽象类，抽象类中可以包含抽象方法（即没有实现的），也可以包含非抽象方法，但是如果有类继承抽象类，那么必须实现其抽象方法（例子中的 testTwo)
     */
    abstract  class  TestAbstractClass{
            void testOne() {
                System.out.println("1234");
            }

        abstract void testTwo();
    }

    /**
     * 定义枚举
     */
    enum TestEnum{

    }

    /**
     * 定义静态类
     */
    static class TestStaticClass{

    }

    /**
     * java语言 可以看到所有测试的类 枚举 接口等都是定义在类 "Keyword" 内部的，而只有这个类前面有个public关键字，
     * java语言中规定 同一个.java文件（本例中的 Keyword.java）可以定义N个 类，枚举，接口等，但是只能有一个带上public关键字，
     * 同一个.java文件中其他类可以是private的，也可以是不写（不写就是默认关键字 default)，但是如果本类写了public关键字，那么类的名字就必须和文件名字（.java)相同
     *
     * 定义在类内部的类叫  内部类  ,如果是static的 就叫静态内部类。
     */


}

/**
 * 同样可以定义在public 类外面 ，其他关键字 类似
 */
class TestOne{

}