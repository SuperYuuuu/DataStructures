package com.hy.array;

public class lowArrayApp {

    public static void main(String[] args) {
        lowArray arr = new lowArray(100);
        int nElems = 0;
        int i;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println("");

        int searchKey = 26;
        for (i = 0; i < nElems; i++) {
            if (arr.getElem(i) == searchKey)
                break;
        }
        if (i == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        for (i = 0; i < nElems;i++) {
            if (arr.getElem(i) == 55) {
                break;
            }
        }
        for (int j = i; j < nElems - 1; j++) {
            arr.setElem(j,arr.getElem(j+1));
        }
        nElems--;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println("");
    }//end main()
}//end class lowArrayApp
