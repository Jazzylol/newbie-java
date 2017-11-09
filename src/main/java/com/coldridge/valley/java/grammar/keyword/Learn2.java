package com.coldridge.valley.java.grammar.keyword;


/**
 * 8种基本数据类型以及其包装类（基本数据类型和包装类的区别？？）
 */
public class Learn2 {


    /**
     * java中包含8中基本数据类型 void不算
     *
     *
     *  Java基本类型共有八种，基本类型可以分为三类，字符类型char，布尔类型boolean
     *  以及数值类型byte、short、int、long、float、double。
     *  数值类型又可以分为整数类型byte、short、int、long
     *  和浮点数类型float、double。
     *  JAVA中的数值类型不存在无符号的，它们的取值范围是固定的，不会随着机器硬件环境或者操作系统的改变而改变。
     *  8 中类型表示范围如下：
     *  byte：8位，最大存储数据量是255，存放的数据范围是-128~127之间。
     *  short：16位，最大数据存储量是65536，数据范围是-32768~32767之间。
     *  int：32位，最大数据存储容量是2的32次方减1，数据范围是负的2的31次方到正的2的31次方减1。
     *  long：64位，最大数据存储容量是2的64次方减1，数据范围为负的2的63次方到正的2的63次方减1。例如  double value = 100L 或者 double value =100l;
     *  float：32位，数据范围在3.4e-45~1.4e38，直接赋值时必须在数字后加上f或F。例如  double value = 100F 或者 double value =100f;
     *  double：64位，数据范围在4.9e-324~1.8e308，赋值时可以加d或D也可以不加。例如  double value = 100D 或者 double value =100d;
     *  boolean：只有true和false两个取值。
     *  char：16位，存储Unicode码，用单引号赋值。 char a = "c"
     *
     * @param args
     */
    public static void main(String[] args) {
        // byte
        byte b = 1;
        Byte bb = new Byte(b);
        System.out.println("包装类Byte bb是可以调用方法的，下面全部类似，bb的值是：" + bb.toString());

        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }



}
