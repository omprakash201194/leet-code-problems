package com.gautam.january;

import java.util.*;

/**
 * @author gautam
 * Created on 07-Jan-21 at 7:15 PM.
 */
public class LongestSubstring {
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        inputs.add("abcabcbb");
        inputs.add("bbbbb");
        inputs.add("pwwkew");
        inputs.add("");
        inputs.add(" ");
        inputs.add("aab");
        inputs.add("dvdf");
        inputs.add("ynyo");
        for (String input : inputs) {
            System.out.println(input+":"+lengthOfLongestSubstring1(input));
        }
    }

    public static int lengthOfLongestSubstring1(String s) {
        int longestSubstringCount = 0;
        Queue<Character> charQueue = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (charQueue.contains(c)) {
                if (longestSubstringCount < charQueue.size()){
                    longestSubstringCount = charQueue.size();
                }
                while (charQueue.peek() != null && !charQueue.peek().equals(c)){
                    charQueue.remove();
                }
                charQueue.remove();
            }
            charQueue.add(c);
        }
        if (longestSubstringCount == 0 && !s.isEmpty()) {
            longestSubstringCount = s.length();
        }
        if (!charQueue.isEmpty() && longestSubstringCount < charQueue.size()) {
            longestSubstringCount = charQueue.size();
        }
        return longestSubstringCount;
    }
    /*public static int lengthOfLongestSubstring(String s) {
        int longestSubstringCount = 0;
        Set<Character> set = new HashSet<>();
        // Iterate over characters in the string
        for (Character c : s.toCharArray()) {
            //Add each character to set
            //Check if the char exists in the set
            //If yes - update the tempCount and compare with longestSubstringCount
            if (set.contains(c)){
                if (longestSubstringCount < set.size()){
                    longestSubstringCount = set.size();
                }
                set.clear();
            }
            //add it to the set
            set.add(c);
        }
        if (longestSubstringCount == 0 && !s.isEmpty()) {
            longestSubstringCount = s.length();
        }
        if (!set.isEmpty() && longestSubstringCount < set.size()) {
            longestSubstringCount = set.size();
        }
        return longestSubstringCount;
    }*/
}
