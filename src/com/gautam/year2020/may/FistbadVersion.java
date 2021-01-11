package com.gautam.year2020.may;

/**
 * @author gautam
 * Created on 11-Jan-21 at 4:05 PM.
 *
 *   First Bad Version
 *
 * Solution
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 *
 * Input: n = 1, bad = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= bad <= n <= 231 - 1
 *
 * REf: https://www.youtube.com/watch?v=RiUhkpIDiOo&list=PLJtzaiEpVo2wRmUCq96zsUwOVD6p66K9e&index=33
 *
 * Used Divide and conquer
 *
 * Time complexity: o(logn)
 * Space Complexity: O(1)
 */
public class FistbadVersion {
    public static void main(String[] args) {
        // API from leet code. Didnt test locally
    }

    public static int firstBadVersion(int n) {
        int first =1, last = n;
        while (first < last) {
            int mid = first+(last-first)/2;
            if(isBadVersion(mid))
                last = mid;  //Check for left of mid
            else
                first = mid+1; //check for right of mid
        }
        return first;
    }

    /**
     * Added to remove compilation issue since this method is provided by API in the platform
     * @param mid
     * @return
     */
    private static boolean isBadVersion(int mid) {
        return false;
    }
}
