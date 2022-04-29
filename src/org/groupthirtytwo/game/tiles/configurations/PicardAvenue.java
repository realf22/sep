package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class PicardAvenue extends Property {
    static class PicardAvenueConstants {
        static final String name = "Picard Avenue";
        static final TileGroup group = TileGroup.YELLOW;
        static final double price = 260d;
        static final double defaultFine = 22d;
        static final double level1Price = 150d;
        static final double level1Fine = 110d;
        static final double level2Price = 150d;
        static final double level2Fine = 330d;
        static final double level3Price = 150d;
        static final double level3Fine = 800d;
        static final double level4Price = 150d;
        static final double level4Fine = 975d;
        static final double hotelPrice = 150d;
        static final double hotelFine = 1150d;
    }
    public PicardAvenue(int position) {
        super(PicardAvenueConstants.name, position, PicardAvenueConstants.group, PicardAvenueConstants.price, PicardAvenueConstants.defaultFine, PicardAvenueConstants.level1Price, PicardAvenueConstants.level1Fine, PicardAvenueConstants.level2Price, PicardAvenueConstants.level2Fine, PicardAvenueConstants.level3Price, PicardAvenueConstants.level3Fine, PicardAvenueConstants.level4Price, PicardAvenueConstants.level4Fine, PicardAvenueConstants.hotelPrice, PicardAvenueConstants.hotelFine);
    }
}
