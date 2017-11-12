package com.coldridge.valley.java.grammar.object;


/**
 * 构造代码块和构造函数以及静态代码块写法以及区别以及执行顺序
 */
public class Learn4 {



    //静态代码块
    static{
        System.out.println("我是静态代码块");
    }

    //构造代码块
    {
        System.out.println("我是构造代码块");
    }


    public Learn4(){
        //构造函数
        System.out.println("我是构造函数");
    }


    /**
     *  之前说过，静态函的生命周期和 类文件.class是相同的，是绑定在.class文件上的
     *
     *  普通函数的生命周期是和对象生命周期是相同的，是绑定在new出来的对象上的。
     *
     *  而新建对象（new）的大致过程 是先加载.class文件，初始化.class文件内部的数据，再以.class文件为模板，新建一个又一个对象
     *
     *  所以理解起来，静态代码块的执行要优先于 对象的函数，而构造器又属于一种特殊的对象函数，所以 静态代码块 要比 构造代码块 和构造函数要早执行
     *
     *  构造代码块  比  构造函数 先执行
     *
     *  所以 new一个对象的时候 执行顺序是  静态代码块 --> 构造代码块 -->构造函数
     *
     *  最后 所有的函数，静态代码块因为绑定在.class文件上，而内存上（jvm）内永远只有一个.class文件对象，所以静态代码块永远只执行一次
     *
     *  构造代码块/函数 同样，只会在new的时候执行一次
     *  自己右键debug
     *
     *
     */











    public static void main(String[] args) {
        new Learn4();
    }


}
