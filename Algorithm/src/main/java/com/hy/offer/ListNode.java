package com.hy.offer;

public class ListNode {
    Integer data;
    ListNode next;

    public ListNode(Integer data) {
        super();
        this.data=data;
    }

    public ListNode(Integer data, ListNode next) {
        super();
        this.data=data;
        this.next=next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data=data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
