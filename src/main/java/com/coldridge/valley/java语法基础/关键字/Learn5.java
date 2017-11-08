package com.coldridge.valley.java语法基础.关键字;


/**
 * 特殊运算符 ++，  += ， —— ，-=  ，区分 i++   ++i的区别
 */
public class Learn5 {

    public static void main(String[] args) {


        test1();


    }

    private static void test1() {


        /**
         *  ++ 表示 对应的数字 +1 后再赋值给自己
         *  += 表示 左面的数字 + 右面的数字 然后再把和赋值给左面的数字
         *  -- 与 ++ 相反，自减 1
         *  -=跟 +=相反，左面减去右面 再赋值给左面
         */
        int a = 1;
        a++;
        System.out.println("a++  执行以后 a = " + a);

        //测试 +=
        int b = 2;
        b += 100;
        System.out.println("+= ， b原来的值是 2, b+=100 以后 b的值是:" + b);

        //测试--
        int c = 1;
        c--;
        System.out.println("-- , c原来的值是 1,--过以后是：" + c);
        //测试 -=

        int d = 10;
        d -= 2;
        System.out.println("-= ,d 原来的值是10，d-=2 以后d的值是：" + d);


        /**
         * 类似的 += 还有 <<=  >>=  ^= |= 就是左面的做了逻辑符号的操作以后得到的新的数字再赋值给左面
         */


        /**
         * 特殊讲解下 i++ 和 ++i的区别（--类似）
         * i++是在该行代码执行完毕，再执行+1的操作，所以在该行代码执行的时候 i一直是原来的值，并未加1，
         * ++1是在该行代码执行之前，优先执行+1的操作，所以在该行代码执行之前已经是加完1的值了。这里说的该行代码是指用到i的代码，没有执行到
         * 使用i的代码的时候，不管是i++还是++i都不会执行的
         * 下面我们使用 && ||来验证
         */
        int i = 0;

        //会执行if中代码，因为在使用i++的时候，i还未++，所以还是等于0，所以第一个条件是true，所以需要判断第二个条件，此时第一部分使用
        //i 的代码已经使用完毕，所以++执行，此时i=1，当来到第二个判断条件的时候，i已经等于1了，所以第二个条件是 true，所以执行if代码
        //此时i代码是1
        if (i++ == 0 && i == 1) {
            System.out.println("i的值是：" + i);
        }


        /**
         * 左面判断条件 ++i先执行所以 i此时已经等于1 不满足条件了，因为&&的特性是，如果第一个条件不满足条件了，那么第二个条件直接跳过（因为&& 是必须2个条件都满足)
         * 所以i++这段代码根本没执行，所以i这个变量只执行了 ++i这段代码，所以i最终值是 1
         */
        //测试 ++1
        i = 0;//重新赋值为0
        if (++i == 0 && i++ == 1) {
            System.out.println("测试 ++1 && ,i的值是：" + i);
        }else{
            System.out.println("测试 ++1 && , 没有执行 ,i的值是:" + i);
        }


        /**
         * 次测试实例跟上一个唯一的区别在于  && 和&
         * &的特点是 不管第一个条件满不满足条件，第二个条件永远都执行，所以在这里 ++执行完以后，i++会再执行一次 也就是 i最终会变成2
         */
        //测试 &
        i = 0;//重新赋值为0
        if (++i == 0 & i++ == 1) {
            System.out.println("测试 ++1 & ,i的值是：" + i);
        }else{
            System.out.println("测试 ++1 & , 没有执行 ,i的值是:" + i);
        }

        /**
         * || 的测试代码自行测试吧，完全类似 &&
         */
    }
}
