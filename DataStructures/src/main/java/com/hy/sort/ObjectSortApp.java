package com.hy.sort;

public class ObjectSortApp {
    public static void main(String[] args) {
        ArrayInOb arr = new ArrayInOb(100);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 64);
        arr.insert("Hash", "Sato", 21);

        System.out.println("Before sorting：");
        arr.display();

        arr.insertionSort();

        System.out.println("After sorting：");
        arr.display();
    }
}
