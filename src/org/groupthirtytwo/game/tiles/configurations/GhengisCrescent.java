package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class GhengisCrescent extends Property {
    static class GhengisCrescentConstants {
        static final String name = "Ghengis Crescent";
        static final TileGroup group = TileGroup.GREEN;
        static final double price = 300d;
        static final double defaultFine = 26d;
        static final double level1Price = 200d;
        static final double level1Fine = 130d;
        static final double level2Price = 200d;
        static final double level2Fine = 390d;
        static final double level3Price = 200d;
        static final double level3Fine = 900d;
        static final double level4Price = 200d;
        static final double level4Fine = 1100d;
        static final double hotelPrice = 200d;
        static final double hotelFine = 1275d;
    }
    public GhengisCrescent(int position) {
        super(GhengisCrescentConstants.name, position, GhengisCrescentConstants.group, GhengisCrescentConstants.price, GhengisCrescentConstants.defaultFine, GhengisCrescentConstants.level1Price, GhengisCrescentConstants.level1Fine, GhengisCrescentConstants.level2Price, GhengisCrescentConstants.level2Fine, GhengisCrescentConstants.level3Price, GhengisCrescentConstants.level3Fine, GhengisCrescentConstants.level4Price, GhengisCrescentConstants.level4Fine, GhengisCrescentConstants.hotelPrice, GhengisCrescentConstants.hotelFine);
    }
}
