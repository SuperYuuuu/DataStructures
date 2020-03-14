package com.hy.linklist;

/**
 * 有序链表的效率：
 *  在有序链表中插入和删除某一项最多需要On次比较（平均N/2），因为必须沿着链表上一步一步走才能找到正确的位置。
 *  然而，可以再O1的时间内找到或删除最小值，因为它总在表头。
 *  如果一个应用频繁地存取最小项，且不需要快速的插入，那么有序链表是一个有效的方案选择。
 *  例如，优先级队列可以用有序链表来实现
 */
public class SortedList {
    private Link2 first;

    public SortedList() {
        first = null;
    }

    public SortedList(Link2[] linkArr) {
        first=null;
        for (int j = 0; j < linkArr.length; j++) {
            insert(linkArr[j]);
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    /**
     *
     * @param key
     */
    public void insert(long key) {
        Link2 newLink = new Link2(key);
        Link2 previous = null;
        Link2 current = first;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public void insert(Link2 k) {
        Link2 previous = null;
        Link2 current = first;

        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = k;
        } else {
            previous.next = k;
        }
        k.next = current;
    }

    public Link2 remove() {
        Link2 temp = first;
        first = first.next;
        return temp;
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
