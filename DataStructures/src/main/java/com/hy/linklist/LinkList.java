package com.hy.linklist;

public class LinkList {
    private Link first;

    public void LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;//newLink --> old first
        first = newLink;//first -->newLink
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {//find link with given key
        Link current = first;//start at 'first'
        while (current.iData != key) {//while no match
            if (current.next == null) {//if end of list
                return null;//didn't find it
            } else {//npt end of list
                current = current.next;//go to next link
            }
        }
        return current;//found it
    }

    public Link delete(int key) {//delete link with given key
        Link current = first;//search for link
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;//didn't find it
            } else {
                previous = current;//go to next link
                current = current.next;
            }
        }//found it
        if (current == first) {//if first link
            first = first.next;//change first
        } else {//otherwise
            previous.next = current.next;//bypass it
        }
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
