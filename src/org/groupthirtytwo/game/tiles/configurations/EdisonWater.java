package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Utilities;

public class EdisonWater extends Utilities {
    static class EdisonWaterConstants {
        static final String name = "Edison Water";
    }
    public EdisonWater(int position) {
        super(EdisonWaterConstants.name, position);
    }
}
