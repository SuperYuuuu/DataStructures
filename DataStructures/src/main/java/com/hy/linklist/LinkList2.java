package com.hy.linklist;

public class LinkList2 {
    private Link2 first;

    public LinkList2() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dd) {
        Link2 newLink = new Link2(dd);
        newLink.next=first;//newLink --> old first
        first = newLink;//first -->newLink
    }

    public long deleteFirst() {
        Link2 temp = first;
        first = first.next;
        return temp.dData;
    }


    public void displayList() {
        System.out.print("List (first-->last): ");
        Link2 current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
