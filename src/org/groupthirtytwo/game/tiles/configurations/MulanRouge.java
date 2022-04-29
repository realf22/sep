package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class MulanRouge extends Property {
    static class MulanRougeConstants {
        static final String name = "Mulan Rouge";
        static final TileGroup group = TileGroup.RED;
        static final double price = 220d;
        static final double defaultFine = 18d;
        static final double level1Price = 150d;
        static final double level1Fine = 90d;
        static final double level2Price = 150d;
        static final double level2Fine = 250d;
        static final double level3Price = 150d;
        static final double level3Fine = 700d;
        static final double level4Price = 150d;
        static final double level4Fine = 875d;
        static final double hotelPrice = 150d;
        static final double hotelFine = 1050d;
    }
    public MulanRouge(int position) {
        super(MulanRougeConstants.name, position, MulanRougeConstants.group, MulanRougeConstants.price, MulanRougeConstants.defaultFine, MulanRougeConstants.level1Price, MulanRougeConstants.level1Fine, MulanRougeConstants.level2Price, MulanRougeConstants.level2Fine, MulanRougeConstants.level3Price, MulanRougeConstants.level3Fine, MulanRougeConstants.level4Price, MulanRougeConstants.level4Fine, MulanRougeConstants.hotelPrice, MulanRougeConstants.hotelFine);
    }
}
