package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class TheAngelsDelight extends Property {
    static class TheAngelsDelightConstants {
        static final String name = "The Angels Delight";
        static final TileGroup group = TileGroup.CYAN;
        static final double price = 100d;
        static final double defaultFine = 6d;
        static final double level1Price = 50d;
        static final double level1Fine = 30d;
        static final double level2Price = 50d;
        static final double level2Fine = 90d;
        static final double level3Price = 50d;
        static final double level3Fine = 270d;
        static final double level4Price = 50d;
        static final double level4Fine = 400d;
        static final double hotelPrice = 50d;
        static final double hotelFine = 550d;
    }
    public TheAngelsDelight(int position) {
        super(TheAngelsDelightConstants.name, position, TheAngelsDelightConstants.group, TheAngelsDelightConstants.price, TheAngelsDelightConstants.defaultFine, TheAngelsDelightConstants.level1Price, TheAngelsDelightConstants.level1Fine, TheAngelsDelightConstants.level2Price, TheAngelsDelightConstants.level2Fine, TheAngelsDelightConstants.level3Price, TheAngelsDelightConstants.level3Fine, TheAngelsDelightConstants.level4Price, TheAngelsDelightConstants.level4Fine, TheAngelsDelightConstants.hotelPrice, TheAngelsDelightConstants.hotelFine);
    }
}
