package com.hy.sort;

public class ArrayBub {

    private long[] arr;
    private int nElems;

    public ArrayBub(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems]=value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int out,in;
        for (out = nElems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
            display();
        }
    }

    public void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void selectSort() {
        int out,in,min;
        for (out = 0; out < nElems; out++) {
            min=out;
            for (in = out + 1; in < nElems; in++) {
                if (arr[in] < arr[min]) {
                    min =in;
                }
            }
            swap(out,min);
        }//end of out
    }//end selectSort
}
