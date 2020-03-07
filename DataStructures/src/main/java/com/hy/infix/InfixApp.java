package com.hy.infix;

import java.util.Scanner;

public class InfixApp {
    public static void main(String[] args) {
        String input,output;
        while (true) {
            System.out.print("Enter infix: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if ("".equals(input)) {
                break;
            }

            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans();
            System.out.println("Postfix is " + output + '\n');
        }
    }
}
