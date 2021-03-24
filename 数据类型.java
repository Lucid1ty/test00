package base;

import javax.lang.model.element.NestingKind;

public class 数据类型 {
    public static void main(String[] args) {
        String a ="helloworld!!!!!!";   //字符串的使用
        //八大基本数据类型
        //整数

        int num = 10;
        byte num2 = 10;
        short num3 = 10;
        long num4 = 10L;   //Long类型要在数字后面加个L用于区别于其他类型

        //小数：浮点数
        float num5 = 50.1F;//类似Long类型，需要加个F来与double类型区分开
        double num6 = 3.1415926;

        //字符
        char name1 = 'A'; //只能写一个字符
        //字符串，String不是关键字，它是类
        String name2 = "chenao";

        //布尔值
        //boolean flag = ture;
        //boolean flag1 = false;
        //整数扩展：   进制  二进制0b   十进制   八进制0   十六进制0x
        int i = 10;
        int i2 = 010;   //八进制0
        int i3 = 0x10; //十六进制0x

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=================================================================");
        //=================================================================
        //浮点数扩展
        //=================================================================
        //float   有限  离散  舍入误差  大约  接近但不等于
        //double
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //做好完全避免使用浮点数进行表示
        //避免！避免！避免！
        float f = 0.1f;
        double d = 1.0/10;
        //两个等号用来判断是否相等
        System.out.println(f==d); //false

        float d1 = 21231313213213213132311f;
        float d2 = d1 + 1;

        System.out.println(d1==d2);//ture
        System.out.println("=================================================================");
        //=================================================================
        //字符扩展
        //=================================================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);

        System.out.println((int)c1);

        System.out.println(c2);

        System.out.println((int)c2);

        //所有的字符本质还是数字
        //编码  Unicode 2字节  0-65536

        char c3 = '\u0061';
        System.out.println(c3);
        //转义字符
        //  \t 制表符
        //  \n 换行

        System.out.println("hello\tworld!");
        System.out.println("hello\nwrold!!");
        System.out.println("=================================================================");

        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb); //false

        String sc = "helloworld!!";
        String sd = "helloworld!!";
        System.out.println(sc==sd); //ture
        //对象  从内存分析
        //boolean flag = ture;

        //if(flag==ture){}  //新手
        //if(flag){}        //老手
        System.out.println("=================================================================");



        //类型转换
        int a1 = 128;
        byte a2 = (byte)a1;   //内存溢出
        //强制类型转换：     (类型)变量名    高到低
        System.out.println(a2);
        //自动类型转换：   低到高
        int a3 = 128;
        double a4 = a3;
        System.out.println(a4);

        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.把在高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题！
         */
        System.out.println("=================================================================");

        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分隔，丝毫不影响输出和计算。
        int money = 10_0000_0000;
        int years = 20;
        //int total = money*years;  //溢出了
        long total1 = (long)money*years;  //这样写才对，先把一个数转换为Long
        System.out.println(total1);





    }
}
