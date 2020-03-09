package com.hy.offer;

import java.util.ArrayList;

public class demo04ArrayList {

    public static void main(String[] args) {
        ListNode nl3 = new ListNode(3);
        ListNode nl2 = new ListNode(2,nl3);
        ListNode nl1 = new ListNode(1,nl2);

        System.out.println(printListFromTailToHead(nl1));
    }


    /**
     * 递归法实现：
     * 要逆序打印链表1->2->3,，可以先逆序打印链表2->3，最后再打印第一个节点1.而链表2->3可以看成一个新的链表
     * ，要逆序打印该链表可以就行使用求解函数，也就是在求解韩式中调用自己
     * @param nodeList
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode nodeList) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (nodeList != null) {
            ret.addAll(printListFromTailToHead(nodeList.next));
            ret.add(nodeList.data);
        }
        return ret;
    }

    /**
     * 使用头插法实现
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        //头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }

        //构建ArrayList
        ArrayList<Integer> ret = new ArrayList<Integer>();
        head = head.next;
        while (head != null) {
            ret.add(head.data);
            head = head.next;
        }
        return ret;
    }

    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        return null;
    }

}
