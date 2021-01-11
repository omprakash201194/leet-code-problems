package com.gautam.january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gautam
 * Created on 11-Jan-21 at 6:23 PM.
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 0 <= n, m <= 200
 * 1 <= n + m <= 200
 * nums1.length == m + n
 * nums2.length == n
 * -109 <= nums1[i], nums2[i] <= 109
 *    Hide Hint #1
 * You can easily solve this problem if you simply think about two elements at a time rather than two arrays. We know that each of the individual arrays is sorted. What we don't know is how they will intertwine. Can we take a local decision and arrive at an optimal solution?
 *    Hide Hint #2
 * If you simply consider one element each at a time from the two arrays and make a decision and proceed accordingly, you will arrive at the optimal solution.
 *
 * Ref : https://www.youtube.com/watch?v=C4oBXLr3zos
 * Lesson: Check if you can use 2 pointers. Also check if you those indexes in backward fashion
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        List<MergeTwoSortedArraysInput> inputs = new ArrayList<>();
        inputs.add(new MergeTwoSortedArraysInput(new int[] {1,2,3,0,0,0},6,new int[]{2,5,6},3));
        inputs.add(new MergeTwoSortedArraysInput(new int[] {1,2,3,0,0,0},3,new int[]{2,5,6},3));
        inputs.add(new MergeTwoSortedArraysInput(new int[] {1},1,new int[]{},0));
        inputs.add(new MergeTwoSortedArraysInput(new int[] {0},0,new int[]{1},1));
        inputs.add(new MergeTwoSortedArraysInput(new int[] {2,0},1,new int[]{1},1));
        inputs.add(new MergeTwoSortedArraysInput(new int[] {4,5,6,0,0,0},3,new int[]{1,2,3},3));
        for (MergeTwoSortedArraysInput input : inputs) {
            merge(input.nums1,input.m,input.nums2, input.n);
            System.out.println(Arrays.toString(input.nums1));
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}

class MergeTwoSortedArraysInput{
    int [] nums1;
    int m;
    int [] nums2;
    int n;

    public MergeTwoSortedArraysInput(int[] nums1, int m, int[] nums2, int n) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
    }

}
