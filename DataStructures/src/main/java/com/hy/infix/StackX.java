package com.hy.infix;

import sun.nio.cs.ext.ISCII91;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[this.maxSize];
        top = -1;
    }

    public void push(char j) {
        if (!isFull()) {
            stackArray[++top] = j;
        }

    }

    public char pop() {
        return  stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public int size() {
        return top+1;
    }

    public char peekN(int n) {
        return stackArray[n];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void dispalyStack(String str) {
        System.out.print(str);
        System.out.print("Stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
