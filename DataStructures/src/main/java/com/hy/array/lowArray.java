package com.hy.array;

public class lowArray {

    private long[] arr;

    public lowArray(int size) {
        arr = new long[size];
    }

    public void setElem(int index, long value) {
        arr[index]=value;
    }

    public long getElem(int index) {
        return arr[index];
    }

}
