package com.hy.sort;

public class InsertSortApp {

    public static void main(String[] args) {
        ArrayIns arr = new ArrayIns(100);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.insertSort();
    }
}
