package com.gautam.january;

/**
 * @author gautam
 * Created on 05-Jan-21 at 7:02 PM.
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int [] list1 = new int[] {1,1,2};
        ListNode l1 = ListNode.getSortedList(list1,null);
        ListNode listNode = deleteDuplicates(l1);
        ListNode.print(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode startNode = null, previousNode = null, currentIterator = head, nextCurrent = head.next;
        // return the node if the size= 1
        if (nextCurrent == null) {
            return head;
        }
        while (nextCurrent != null) {
            if (currentIterator.val !=nextCurrent.val) {
                if (startNode == null) {
                    startNode = currentIterator;
                    previousNode = startNode;
                } else {
                    previousNode.next = currentIterator;
                    previousNode = currentIterator;
                }
            }
            // Keep iterating until you find different values
            while (nextCurrent != null && currentIterator.val == nextCurrent.val) {
                nextCurrent = nextCurrent.next;
            }
            currentIterator = nextCurrent;
            if (currentIterator == null) {
                if (previousNode != null) {
                    previousNode.next = currentIterator;
                }
                return startNode;
            }
            nextCurrent = nextCurrent.next;

            //Handle last node
            if (nextCurrent == null) {
                if (previousNode != null) {
                    previousNode.next = currentIterator;
                }
                //If first node is not initialized fix it
                if (startNode == null){
                    startNode = currentIterator;
                    previousNode = startNode;
                }
            }

        }
        return startNode;
    }
}


