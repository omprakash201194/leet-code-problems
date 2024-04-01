package com.gautam.leetcode.arrays;

public class L58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] data = s.toCharArray();
        if(data.length == 1) {
            return 1;
        }
        int end = data.length;
        int start = end;
        while(data[end -1] == ' '){
            end--;
            start--;
        }
        while(start > 0 && data[start-1] != ' '){
            start--;
        }
        return end - start;
    }
}
