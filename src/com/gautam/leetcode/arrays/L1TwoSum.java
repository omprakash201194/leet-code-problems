package com.gautam.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class L1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        int length = nums.length;
        for(int i=0; i<length; i++){
            if(data.containsKey(target - nums[i])){
                return new int[]{i, data.get(target - nums[i])};
            } else {
                data.put(nums[i],i);
            }
        }
        return new int[]{0};
    }


}
