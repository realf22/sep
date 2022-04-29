package org.groupthirtytwo.game.utils;

public class MathUtils {

    /**
     * Returns the sum of an integer array
     * @param values
     * @return
     */
    public static int sum(int[] values) {
        int sum = 0;
        for(int i : values) {
            sum += i;
        }
        return sum;
    }
}