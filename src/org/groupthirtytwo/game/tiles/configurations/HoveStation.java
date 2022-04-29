package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Station;

public class HoveStation extends Station {
    static class HoveStationConstants {
        static final String name = "Hove Station";
    }
    public HoveStation(int position) {
        super(HoveStationConstants.name, position);
    }
}
