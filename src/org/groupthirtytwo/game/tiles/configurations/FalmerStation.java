package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Station;

public class FalmerStation extends Station {
    static class FalmerStationConstants {
        static final String name = "Falmer Station";
    }
    public FalmerStation(int position) {
        super(FalmerStationConstants.name, position);
    }
}
