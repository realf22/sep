package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Station;

public class BrightonStation extends Station {
    static class BrightonStationConstants {
        static final String name = "Brighton Station";
    }
    public BrightonStation(int position) {
        super(BrightonStationConstants.name, position);
    }
}
