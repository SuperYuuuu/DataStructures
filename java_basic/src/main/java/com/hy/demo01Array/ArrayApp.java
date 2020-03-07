package com.hy.demo01Array;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        //数组概念：数组就是存储长度固定的容器，保证多个数据的数据类型要一致

        //数组定义的三种方式
        int[] arr1 = new int[3];

        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        int[] arr3 = {1, 2, 3, 4, 5};



        /*
        数组的访问：
            索引
            数组的长度属性：arr1.length
        数组常见的操作：
            数组越界异常：ArrayIndexOutOfBoundsException
            数组空指针异常：NullPointerException
         */


        //数组反转
        Array.verse(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
