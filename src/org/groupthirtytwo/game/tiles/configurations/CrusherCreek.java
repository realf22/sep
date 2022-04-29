package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class CrusherCreek extends Property {
    static class CrusherCreekConstants {
        static final String name = "Crusher Creek";
        static final TileGroup group = TileGroup.YELLOW;
        static final double price = 280d;
        static final double defaultFine = 22d;
        static final double level1Price = 150d;
        static final double level1Fine = 120d;
        static final double level2Price = 150d;
        static final double level2Fine = 360d;
        static final double level3Price = 150d;
        static final double level3Fine = 850d;
        static final double level4Price = 150d;
        static final double level4Fine = 1025d;
        static final double hotelPrice = 150d;
        static final double hotelFine = 1200d;
    }
    public CrusherCreek(int position) {
        super(CrusherCreekConstants.name, position, CrusherCreekConstants.group, CrusherCreekConstants.price, CrusherCreekConstants.defaultFine, CrusherCreekConstants.level1Price, CrusherCreekConstants.level1Fine, CrusherCreekConstants.level2Price, CrusherCreekConstants.level2Fine, CrusherCreekConstants.level3Price, CrusherCreekConstants.level3Fine, CrusherCreekConstants.level4Price, CrusherCreekConstants.level4Fine, CrusherCreekConstants.hotelPrice, CrusherCreekConstants.hotelFine);
    }
}
