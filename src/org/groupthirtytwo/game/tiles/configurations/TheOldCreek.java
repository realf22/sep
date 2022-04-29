package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class TheOldCreek extends Property {
    static class TheOldCreekConstants {
        static final String name = "The Old Creek";
        static final TileGroup group = TileGroup.BROWN;
        static final double price = 60d;
        static final double defaultFine = 2d;
        static final double level1Price = 50d;
        static final double level1Fine = 10d;
        static final double level2Price = 50d;
        static final double level2Fine = 30d;
        static final double level3Price = 50d;
        static final double level3Fine = 90d;
        static final double level4Price = 50d;
        static final double level4Fine = 160d;
        static final double hotelPrice = 50d;
        static final double hotelFine = 250d;
    }
    public TheOldCreek(int position) {
        super(TheOldCreekConstants.name, position, TheOldCreekConstants.group, TheOldCreekConstants.price, TheOldCreekConstants.defaultFine, TheOldCreekConstants.level1Price, TheOldCreekConstants.level1Fine, TheOldCreekConstants.level2Price, TheOldCreekConstants.level2Fine, TheOldCreekConstants.level3Price, TheOldCreekConstants.level3Fine, TheOldCreekConstants.level4Price, TheOldCreekConstants.level4Fine, TheOldCreekConstants.hotelPrice, TheOldCreekConstants.hotelFine);
    }
}
