package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Station;

public class PortsladeStation extends Station {
    static class PortsladeStationConstants {
        static final String name = "Portslade Station";
    }
    public PortsladeStation(int position) {
        super(PortsladeStationConstants.name, position);
    }
}
