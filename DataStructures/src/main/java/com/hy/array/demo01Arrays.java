package com.hy.array;

public class demo01Arrays {

    public static void main(String[] args) {

        long[] arr = new long[100];
        int nElems = 0;
        int i;//loop counter
        long searchKey;//key of item to search for

        //==================================================
        arr[0] = 77;//insert 10 items
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;//now 10 items in array

        //===================================================
        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //===================================================
        searchKey = 66;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey) {
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        //===================================================
        searchKey = 55;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey) {
                break;
            }
        }
        for (int j = i; j < nElems-1; j++) {
            arr[j] = arr[j + 1];
        }
        nElems--;

        //===================================================
        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }//end main()
}//end class ArrayApp
