package com.gautam.january;

/**
 * @author gautam
 * Created on 09-Jan-21 at 8:05 PM.
 */
public class MoneyIntheBank {

    public static void main(String[] args) {
        int [] inputs = new int[] {4,10,20,175};
        for (int input : inputs) {
            System.out.println(totalMoney(input));
        }
    }
    public static int totalMoney(int n) {

        // n =4
        int total = 0, initialWeekAmount = 1;
        int days = 7;
        int weeks = n/7;
        for (int i = 0; i<= weeks; i++) {
            int initialDayAmount = initialWeekAmount;
            if (n < 7) {
                days = n;
            }
            for (int j = 0; j < days; j++) {
                total += initialDayAmount++;
            }
            if (n >= 7) {
                n = n - 7;
            }
            initialWeekAmount++;
        }
        return total;
    }
}
