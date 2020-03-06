package com.hy.array;

import com.hy.domain.Person;

public class ClassDataArray {

    private Person[] arr;
    private int nElems;

    public ClassDataArray(int max) {
        arr = new Person[max];
        nElems = 0;
    }

    /**
     *
     * @param searchName
     * @return
     */
    public Person find(String searchName) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i].getLast().equals(searchName)) {
                break;
            }
        }
        if (i == nElems) {
            return null;
        } else {
            return arr[i];
        }
    }

    /**
     *
     * @param last
     * @param first
     * @param age
     */
    public void insert(String last, String first, Integer age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    /**
     *
     * @param searchName
     * @return
     */
    public boolean delete(String searchName) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (searchName.equals(arr[i].getLast())) {
                break;
            }
        }
        if (i == nElems) {
            return false;
        } else {
            for (int j = i; j < nElems-1; j++) {
                arr[j]=arr[j+1];
            }
            nElems=nElems-1;
            return true;
        }
    }

    /**
     *
     */
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(arr[i].toString());
        }
    }

}
