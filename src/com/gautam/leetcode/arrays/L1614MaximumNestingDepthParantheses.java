package com.gautam.leetcode.arrays;

import java.util.Stack;

public class L1614MaximumNestingDepthParantheses {
    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(input));
        System.out.println(maxDepth("(1)+((2))+((((3))))"));
    }

    public static int maxDepth(String s) {
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            max=Math.max(count,max);
            if(s.charAt(i)==')') count--;
        }
        return max;
    }
}
