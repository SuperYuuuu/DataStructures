package com.hy.stack;

import com.hy.stack.BracketChecker;

import java.util.Scanner;

public class BracketsApp {
    public static void main(String[] args) {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters:");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }
}
