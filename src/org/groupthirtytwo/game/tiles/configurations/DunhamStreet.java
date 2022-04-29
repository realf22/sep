package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class DunhamStreet extends Property {
    static class DunhamStreetConstants {
        static final String name = "Dunham Street";
        static final TileGroup group = TileGroup.ORANGE;
        static final double price = 180d;
        static final double defaultFine = 14d;
        static final double level1Price = 100d;
        static final double level1Fine = 70d;
        static final double level2Price = 100d;
        static final double level2Fine = 200d;
        static final double level3Price = 100d;
        static final double level3Fine = 550d;
        static final double level4Price = 100d;
        static final double level4Fine = 750d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 950d;
    }
    public DunhamStreet(int position) {
        super(DunhamStreetConstants.name, position, DunhamStreetConstants.group, DunhamStreetConstants.price, DunhamStreetConstants.defaultFine, DunhamStreetConstants.level1Price, DunhamStreetConstants.level1Fine, DunhamStreetConstants.level2Price, DunhamStreetConstants.level2Fine, DunhamStreetConstants.level3Price, DunhamStreetConstants.level3Fine, DunhamStreetConstants.level4Price, DunhamStreetConstants.level4Fine, DunhamStreetConstants.hotelPrice, DunhamStreetConstants.hotelFine);
    }
}
