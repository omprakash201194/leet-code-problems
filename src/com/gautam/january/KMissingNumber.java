package com.gautam.january;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gautam
 * Created on 06-Jan-21 at 7:58 PM.
 *
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 *
 * Find the kth positive integer that is missing from this array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 * Example 2:
 *
 * Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * 1 <= k <= 1000
 * arr[i] < arr[j] for 1 <= i < j <= arr.length
 */
public class KMissingNumber {

    public static void main(String[] args) {
        List<KMissingNumberInput> inputs = new ArrayList<>();

        KMissingNumberInput input = new KMissingNumberInput(new int[] {2,3,4,7,11}, 5);
        inputs.add(input);
        KMissingNumberInput input2 = new KMissingNumberInput(new int[] {1,2,3,4}, 2);
        inputs.add(input2);
        KMissingNumberInput input3 = new KMissingNumberInput(new int[] {3,10}, 2);
        inputs.add(input3);

        KMissingNumberInput input4 = new KMissingNumberInput(new int[] {1,13,18}, 17);
        inputs.add(input4);

        for (KMissingNumberInput kMissingNumberInput : inputs) {
            System.out.println(findKthPositive(kMissingNumberInput.arr, kMissingNumberInput.k));
        }
    }
    public static int findKthPositive(int[] arr, int k) {
        int number = 1, missingNumberCount = 0 , missingNumber = 0;
        for (int i = 0; i < arr.length;number++) {
            if (arr[i] != number) {
                missingNumberCount++;
                missingNumber = number;
            } else{
                i++;
            }
            if (missingNumberCount == k) {
                return missingNumber;
            }

        }
        if (missingNumberCount != k){
            missingNumber = number + k - missingNumberCount - 1;
        }
        return missingNumber;
    }
}

class KMissingNumberInput {
    public KMissingNumberInput(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    int [] arr;
    int k;
}