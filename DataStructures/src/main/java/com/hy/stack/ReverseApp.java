package com.hy.stack;

import java.util.Scanner;

public class ReverseApp {
    public static void main(String[] args) {
        String input,output;
        while (true) {
            System.out.print("Enter a string：");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed：" + output);
        }
    }
}
