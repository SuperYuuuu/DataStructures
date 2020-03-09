package com.hy.offer;

public class Stack {

    private int maxSize;
    private Integer[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Integer[maxSize];
        top = -1;
    }

    public void push(Integer j) {
        stackArray[++top] = j;
    }

    public Integer pop() {
        return stackArray[top--];
    }

    public Integer peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
