package com.hy.stack;

public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        StackX theStack = new StackX(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                ch == ')' && chx != '(') {
                            System.out.println("Error：" + ch + " at " + i);
                        }
                    } else {
                        System.out.println("Error：" + ch + " at " + i);
                    }
                    break;
                    default:
                        break;
            }//end of switch
        }//end for
        if (!theStack.isEmpty()) {
            System.out.println("Error:missing right delimiter");
        }
    }//end check()
}
