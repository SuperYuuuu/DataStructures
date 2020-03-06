package com.hy.queue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue thePQ = new PriorityQueue(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.println(item + " ");//10,20,30,40,50
        }//end while
        System.out.println("");
    }//end main()
}//end class PriorityQueueApp
