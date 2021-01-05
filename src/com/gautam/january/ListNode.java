package com.gautam.january;

/**
 * @author gautam
 * Created on 05-Jan-21 at 7:02 PM.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode getSortedList(int[] list, ListNode root) {
        ListNode temp = null;
        for (int i : list) {
            ListNode node = new ListNode(i);
            if (root == null) {
                root = node;
            }
            if (temp != null) {
                temp.next = node;
                temp = node;
            } else {
                temp = node;
            }
        }
        return root;
    }

    public static void print(ListNode listNode) {
        if (listNode != null) {
            while (listNode != null) {
                System.out.print(listNode.val);
                listNode = listNode.next;
                if (listNode != null) {
                    System.out.print( "->");
                }
            }
            System.out.println("");
        } else{
            System.out.println("Empty node");
        }
    }
}
