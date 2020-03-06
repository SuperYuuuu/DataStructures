package com.hy.array;

import com.hy.domain.Person;

public class ClassDataApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 64);
        arr.insert("Hash", "Sato", 21);

        arr.display();

        String searchName = "Yee";
        Person found = arr.find(searchName);
        if (found != null) {
            System.out.print("Found ");
            System.out.println(found.toString());
        } else {
            System.out.println("Cane't find " + searchName);
        }

        System.out.println("Deleting Smith and Adams");
        arr.delete("Smith");
        arr.delete("Adams");

        arr.display();

    }//end main()
}//end class
