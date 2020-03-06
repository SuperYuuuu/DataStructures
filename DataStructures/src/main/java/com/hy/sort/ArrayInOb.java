package com.hy.sort;

import com.hy.domain.Person;

public class ArrayInOb {
    private Person[] arr;
    private int nElems;

    public ArrayInOb(int max) {
        arr = new Person[max];
        nElems=0;
    }

    public void insert(String last, String first, Integer age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public void insertionSort() {
        int in,out;

        for (out = 1; out < nElems; out++) {
            Person temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in]=temp;
        }
    }

}
