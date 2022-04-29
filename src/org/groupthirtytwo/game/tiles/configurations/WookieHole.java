package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class WookieHole extends Property {
    static class WookieHoleConstants {
        static final String name = "Wookie Hole";
        static final TileGroup group = TileGroup.PURPLE;
        static final double price = 140d;
        static final double defaultFine = 10d;
        static final double level1Price = 100d;
        static final double level1Fine = 50d;
        static final double level2Price = 100d;
        static final double level2Fine = 150d;
        static final double level3Price = 100d;
        static final double level3Fine = 450d;
        static final double level4Price = 100d;
        static final double level4Fine = 625d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 750d;
    }
    public WookieHole(int position) {
        super(WookieHoleConstants.name, position, WookieHoleConstants.group, WookieHoleConstants.price, WookieHoleConstants.defaultFine, WookieHoleConstants.level1Price, WookieHoleConstants.level1Fine, WookieHoleConstants.level2Price, WookieHoleConstants.level2Fine, WookieHoleConstants.level3Price, WookieHoleConstants.level3Fine, WookieHoleConstants.level4Price, WookieHoleConstants.level4Fine, WookieHoleConstants.hotelPrice, WookieHoleConstants.hotelFine);
    }
}
