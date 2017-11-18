package com.coldridge.valley.java.grammar.object;


/**
 * jvm是什么 jvm内存结构是怎么分配的
 */
public class Learn8 {


    /**
     * 学习文章：https://www.cnblogs.com/jiyukai/p/6665199.html
     */


    /**
     * 首先 java中内存的管理对开发者完全透明的，但是依旧需要知道jvm中的内存结构
     * 如图 http://images2015.cnblogs.com/blog/1135193/201704/1135193-20170404105818910-121962267.jpg
     * 内存按图分为 线程共享的方法区和堆，线程非共享的虚拟机栈和程序计数器
     * 每个分区的大致作用可以查看 http://www.cnblogs.com/coldridgeValley/p/5295877.html
     * 这里简单说明下：
     * 程序计数器：你的程序走到哪一行了，需要记录下来。
     * 虚拟机栈：java的方法在该区域执行，方法内部涉及的变量分配也是在该部分进行（只涉及名称的分配以及部分简单变量比如基本数据类型的分配），例如
     *      A a = new A();  a这个变量的分配是在虚拟机栈中的，而new A()这个对象的实际存放位置则是在堆内存中
     * 方法区：用于存储已经被jvm加载的类信息，常量，静态变量，比如之前说static变量的时候，说到的static变量的加载，那么加载完的变量就是放置在这个区域
     * 堆：java内存结构中最大的一部分，主要放置的是java的对象  比如上面说的  new A()  创建出来的一个对象
     *
     *
     */


    /**
     * 介绍那么多主要想对着 jvm内存结构重新说下对象的创建过程即new的过程
     */



    private static Integer a = 100;
    private  int b = 100;

    public Learn8() {
        b = 102;
    }

    public Learn8(int b) {
        this.b = b;
    }

    {
        b = 101;
    }


    public static void main(String[] args) {
        Learn8 one = new Learn8();
        System.out.println(one.b);

        /**
         * 该对象的创建过程如下：
         * 1、new Learn8()告诉jvm我要创建一个Learn8的对象，
         * 2、jvm在方法区中查找是否有 Learn8.class类存在，不存在转3，存在转7
         * 3、不存在 Learn8的class文件，则从classpath中查找，找不到报错，找到转4
         * 4、加载Learn8.class文件到内存，抽象为Class对象 转5
         * 5、准备初始化 Learn8的class对象，检查该类所有的静态引用，如果该类有父类，那么重新从jvm中加载父类，转2，等待父类加载完毕，继续检查
         *    优先检查父类的静态变量，引用等，如果父类还有父类，重复步骤2，知道全部加载完毕，从最顶层父类开始，初始化静态代码块，静态变量。
         *    初始化Learn8的时候发现该类存在静态变量a，默认初始化为null（对象都是默认初始化为null），然后初始化为100
         * 6、没有静态的内容以后（静态代码块，静态变量），class对象初始化完毕，初始化完毕的class对象放置在方法区
         * 7、使用Learn8的class对象的 newInstance()方法创建一个Learn8实例，创建实例的过程如下
         * 8、在堆内存中创建一个为初始化的Learn8对象，准备初始化
         * 9、遍历Learn8对象查看是否有父类，有父类，从最顶层的父类开始一步一步调用 构造代码块，构造函数直至到Learn8,发现存在成员变量b，
         *      优先初始化b，因为b是基本数据类型，所以b会被初始化为0，然后再被赋值成100,然后执行构造代码块，再执行构造函数(new Learn()
         *      对应的是无参构造函数，所以不会调用 Learn8(int b)，调用完毕以后初始化完成
         * 10、对象初始化完毕，创建成功，该对象有一个内存地址，64进制的内存地址
         * 11、在JVM栈中创建变量 one，将10的内存地址赋值给one
         * 12、Learn8 one = new Learn8(); 执行完毕
         */

    }

}



