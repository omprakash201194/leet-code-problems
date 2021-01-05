package com.gautam.january;

/**
 * @author gautam
 * Created on 05-Jan-21 at 7:02 PM.
 *
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 *
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 *
 *
 * Example 2:
 * Input: head = [1,1,1,2,3]
 * Output: [2,3]
 *
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int [] list1 = new int[] {1,1,2};
        ListNode l1 = ListNode.getSortedList(list1,null);
        ListNode listNode = deleteDuplicates(l1);
        ListNode.print(listNode);
    }

    /**
     * Delete duplicates list node.
     *
     * @param head the head
     * @return the list node
     *
     * Reference: https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/discuss/1003000/Simple-java-solution-with-explaination-0ms-100-faster
     * 1.To avoid head null checks create dummy node and point dummy.next=head.
     * 2.Take two pointers. prev and temp. prev point to dummy initially and temp point to head.
     * 3. loop till temp and temp next is available. (as for single node nothing to be deleted)
     * 4. if matching element found keep on incrementing temp without changing previous inside loop.
     * 5. after loop finishes at point 4 we use boolean to check if some duplicates has found. if yes just point prev.next=temp.next. else just increment prev.
     * 6. in any case if duplicate exists or not increment temp to point to next element.
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(101,head);
        ListNode prev = dummy;
        ListNode temp = head;
        boolean match;
        while(temp!=null && temp.next!=null) {
            match=false;
            while(temp.next!=null && temp.next.val==temp.val) {
                temp=temp.next;
                match=true;
            }
            if(match) {
                prev.next=temp.next;
            } else {
                prev=prev.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}


