package org.groupthirtytwo.game.dice;

import org.groupthirtytwo.game.utils.MathUtils;

import java.util.SplittableRandom;

public class Dice {
    static class DiceConstants {
        static int diceRolls = 1;
        static int diceSidesMin = 1;
        static int diceSidesMax = 6;
    }

    final SplittableRandom random;

    public Dice() {
        this.random = new SplittableRandom();
    }

    /**
     * Rolls all dice and returns the total.
     * @return int (minV <-> maxV) * diceThrown
     */
    public int roll() {
        int[] diceRolls = new int[DiceConstants.diceRolls];
        for (int i = 0; i < diceRolls.length; i++) {
            diceRolls[i] = random.nextInt(DiceConstants.diceSidesMin, DiceConstants.diceSidesMax);
        }

        return MathUtils.sum(diceRolls);
    }
}
