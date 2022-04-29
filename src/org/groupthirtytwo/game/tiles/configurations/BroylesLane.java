package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class BroylesLane extends Property {
    static class BroylesLaneConstants {
        static final String name = "Broyles Lane";
        static final TileGroup group = TileGroup.ORANGE;
        static final double price = 200d;
        static final double defaultFine = 16d;
        static final double level1Price = 100d;
        static final double level1Fine = 80d;
        static final double level2Price = 100d;
        static final double level2Fine = 220d;
        static final double level3Price = 100d;
        static final double level3Fine = 600d;
        static final double level4Price = 100d;
        static final double level4Fine = 800d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 1000d;
    }
    public BroylesLane(int position) {
        super(BroylesLaneConstants.name, position, BroylesLaneConstants.group, BroylesLaneConstants.price, BroylesLaneConstants.defaultFine, BroylesLaneConstants.level1Price, BroylesLaneConstants.level1Fine, BroylesLaneConstants.level2Price, BroylesLaneConstants.level2Fine, BroylesLaneConstants.level3Price, BroylesLaneConstants.level3Fine, BroylesLaneConstants.level4Price, BroylesLaneConstants.level4Fine, BroylesLaneConstants.hotelPrice, BroylesLaneConstants.hotelFine);
    }
}
