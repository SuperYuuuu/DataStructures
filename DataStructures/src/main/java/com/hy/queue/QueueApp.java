package com.hy.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue2 theQueue = new Queue2(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();


        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.insert(90);



        while (!theQueue.isEmpty()) {
            System.out.println(theQueue.remove() + " ");
        }
        System.out.println("");
    }
}
