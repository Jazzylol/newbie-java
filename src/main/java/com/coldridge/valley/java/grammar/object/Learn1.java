package com.coldridge.valley.java.grammar.object;


/**
 * 什么叫对象，如何定义一个对象
 */
public class Learn1 {

    public static void main(String[] args) {


        /**
         * java使用关键字  new来新建对象
         */

        Learn1 one = new Learn1();

        /**
         * 对象内部包含 方法 变量
         * 方法分为 静态方法 和 成员方法
         * 变量分为  静态变量 和 非静态变量
         *
         *  静态方法的调用是  类名.方法名 例如  Learn1.test1()
         *  成员方法必须先新建一个对象，再使用对象来调用方法  例如   one.test2()
         *  之所以一个称为静态方法，一个称为成员方法 是因为 static修饰的方法或者变量，他的生命周期跟类的class文件是相同的生命周期（本例里是 Learn1.class)
         *  成员方法和成员变量的生命周期是 跟 单独一个对象绑定在一起的。
         *
         *  这要说到java中新建对象都是 jvm把 .class文件加载到 jvm中，然后在通过解析 .class文件 新建出一个又一个对象
         *
         *  也就是说 成员变量或者方法 有很多很多个，每个都跟对应的对象绑定在一起
         *
         *  而静态static修饰的变量或者方法整个内存里独一份，跟.class文件绑定在一起，这个也就是所谓的生命周期的不同的含义
         *
         *  再具体的百度
         *
         */

        Learn1.test1();

        one.test2();
    }

    public  static void test1() {
        System.out.println("我是静态方法");
    }


    public void test2() {
        System.out.println("我是成员方法");
    }

}
