package com.gautam.leetcode.arrays;

import java.util.HashMap;

public class L205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check mapping from s to t
            if (sToT.containsKey(sChar)) {
                if (sToT.get(sChar) != tChar) {
                    return false; // Mismatch found
                }
            } else {
                sToT.put(sChar, tChar);
            }

            // Check mapping from t to s
            if (tToS.containsKey(tChar)) {
                if (tToS.get(tChar) != sChar) {
                    return false; // Mismatch found
                }
            } else {
                tToS.put(tChar, sChar);
            }
        }

        return true;
    }
}
