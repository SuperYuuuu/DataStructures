package com.hy.demo01Array;

public class Array {

    public static void verse(int[] arr) {
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
    }
}
