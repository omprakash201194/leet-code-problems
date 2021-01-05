package com.gautam.january;

/**
 * @author gautam
 * Created on 04-Jan-21 at 6:06 PM.
 *
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: l1 = [], l2 = []
 * Output: []
 * Example 3:
 *
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both l1 and l2 are sorted in non-decreasing order.
 *
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        int [] list1 = new int[] {2};
        int [] list2 = new int[] {1};
        ListNode l1 = getSortedList(list1,null);
        ListNode l2 = getSortedList(list2, null);
        ListNode finalNode = mergeTwoLists(l1, l2);

    }

    private static ListNode getSortedList(int[] list, ListNode root) {
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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalNode = new ListNode(-1), currentIterator = finalNode;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                currentIterator.next = l1;
                l1 = l1.next;
            } else {
                currentIterator.next = l2;
                l2 = l2.next;
            }
            currentIterator = currentIterator.next;
        }

        if(l1 != null) currentIterator.next = l1;
        if(l2 != null) currentIterator.next = l2;

        return finalNode.next;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}