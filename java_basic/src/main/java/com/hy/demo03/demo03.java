package com.hy.demo03;

import java.util.Random;
import java.util.Scanner;

/*
API(Application Programming Interface)，应用程序编程接口，Java API是一本程序员的字典，是JDK中提供给我们
使用的类的说明文档。这些类将底层的代码实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可
 */
public class demo03 {
    public static void main(String[] args) {

        //Scanner
        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
*/
        /*
        匿名对象：创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量。虽然是创建对象的简化写法，但是应用场景
        十分有限。
        应用场景：创建对象直接调用方法
        */

        //Random
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

    }
}
