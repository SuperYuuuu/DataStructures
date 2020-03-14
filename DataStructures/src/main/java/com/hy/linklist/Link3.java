package com.hy.linklist;

public class Link3 {
    public long dData;
    public Link3 next;
    public Link3 previous;

    public Link3(long d) {
        dData=d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
