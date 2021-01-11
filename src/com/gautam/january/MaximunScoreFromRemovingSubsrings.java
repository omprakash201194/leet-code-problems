package com.gautam.january;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gautam
 * Created on 09-Jan-21 at 8:30 PM.
 */
public class MaximunScoreFromRemovingSubsrings {
    public static void main(String[] args) {
        List<Inputs> inputs = new ArrayList<>();
        inputs.add(new Inputs("cdbcbbaaabab", 4,5));
        inputs.add(new Inputs("aabbaaxybbaabb", 5,4));

        for (Inputs input : inputs) {
            System.out.println(maximumGain(input.s, input.x, input.y));
        }
    }

    public static int maximumGain(String s, int x, int y) {
        int maximumGain = 0;
        String opX = "ab";
        String opY = "ba";
        char[] word = s.toCharArray();
        for (int i = 0, j= 1; i < s.length() - 1; i++,j++ ) {
            
        }
        return maximumGain;
    }
}

class Inputs {
    String s;
    int x;
    int y;

    public Inputs(String s, int x, int y) {
        this.s = s;
        this.x = x;
        this.y = y;
    }
}
