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
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode sortedList = new ListNode();
        ListNode finalList = sortedList;
        ListNode temp1Iterator = l1;
        ListNode temp2Iterator = l2;
        while (temp1Iterator != null || temp2Iterator!= null) {
            if (temp2Iterator == null) {
                // Add remaining 1nd list nodes
                sortedList.val = temp1Iterator.val;
                sortedList.next = temp1Iterator.next;
                temp1Iterator = null;
            }
            if (temp1Iterator != null && temp2Iterator != null && temp1Iterator.val < temp2Iterator.val) {
                sortedList.val = temp1Iterator.val;
                temp1Iterator = temp1Iterator.next;

                if (temp1Iterator != null || temp2Iterator != null) {
                    sortedList.next = new ListNode();
                    sortedList = sortedList.next;
                }
            }
            if (temp1Iterator != null && temp2Iterator!= null && temp1Iterator.val == temp2Iterator.val) {
                sortedList.val = temp1Iterator.val;

                sortedList.next = new ListNode(temp2Iterator.val);
                sortedList = sortedList.next;

                temp1Iterator = temp1Iterator.next;
                temp2Iterator = temp2Iterator.next;

                if (temp1Iterator != null || temp2Iterator != null) {
                    sortedList.next = new ListNode();
                    sortedList = sortedList.next;
                }
            }
            if (temp1Iterator != null && temp2Iterator!= null && temp1Iterator.val > temp2Iterator.val){
                sortedList.val = temp2Iterator.val;
                temp2Iterator = temp2Iterator.next;

                if (temp2Iterator != null || temp1Iterator != null) {
                    sortedList.next = new ListNode();
                    sortedList = sortedList.next;
                }
            }
            if (temp1Iterator == null && temp2Iterator != null) {
                // Add remaining 2nd list nodes
                sortedList.val = temp2Iterator.val;
                sortedList.next = temp2Iterator.next;
                temp2Iterator = null;
            }
        }
        return finalList;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}