package com.hy.array;

public class highArray {

    private long[] arr;
    private int nElems;

    public highArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long serachKey) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == serachKey)
                break;
        }
        if (i == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElems) {
            return false;
        } else {
            for (int j = i; j < nElems - 1; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    /**
     *
     * @return
     */
    public long getMax() {
        if (nElems == 0) {
            return -1;
        } else {
            long max = arr[0];
            for (int i = 1; i < nElems; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    /**
     *
     */
    public void removeMax() {
        long max = getMax();
        delete(max);
    }

}
