package com.hy.linklist;

import java.util.Random;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;
        Link2[] linkArray = new Link2[size];

        for (int j = 0; j < size; j++) {
            int n = new Random().nextInt(10);
            Link2 newLink = new Link2(n);
            linkArray[j] = newLink;
        }

        System.out.print("Unsorted array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(linkArray[j].dData + " ");
        }
        System.out.println("");

        SortedList theSortedList = new SortedList(linkArray);

        for (int j = 0; j < size; j++) {
            linkArray[j] = theSortedList.remove();
        }
        System.out.print("Sorted Array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(linkArray[j].dData + " ");
        }
        System.out.println("");
    }
}
