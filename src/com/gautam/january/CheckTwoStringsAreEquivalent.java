package com.gautam.january;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gautam
 * Created on 08-Jan-21 at 5:23 PM.
 *
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 * Example 2:
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 * Example 3:
 *
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 *    Hide Hint #1
 * Concatenate all strings in the first array into a single string in the given order, the same for the second array.
 *    Hide Hint #2
 * Both arrays represent the same string if and only if the generated strings are the same.
 *  
 */
public class CheckTwoStringsAreEquivalent {
    public static void main(String[] args) {
        List<CheckTwoStringsAreEquivalentInput> inputs = new ArrayList<>();
        inputs.add(new CheckTwoStringsAreEquivalentInput(new String[]{"ab", "c"},new String[] {"a", "bc"}));
        inputs.add(new CheckTwoStringsAreEquivalentInput(new String[]{"a", "cb"},new String[] {"ab", "c"}));
        inputs.add(new CheckTwoStringsAreEquivalentInput(new String[]{"abc", "d","defg"},new String[] {"abcddefg"}));
        for (CheckTwoStringsAreEquivalentInput input : inputs) {
            System.out.println(arrayStringsAreEqual(input.word1,input.word2));
        }
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1 == null && word2 == null) {
            return true;
        }
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for (String s : word1) {
            w1.append(s);
        }
        for (String s : word2) {
            w2.append(s);
        }
        return w1.toString().equals(w2.toString());
    }
}

class CheckTwoStringsAreEquivalentInput {
    String[] word1;
    String[] word2;

    public CheckTwoStringsAreEquivalentInput(String[] word1, String[] word2) {
        this.word1 = word1;
        this.word2 = word2;
    }
}
