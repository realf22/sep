package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class ReyLane extends Property {
    static class WookieHoleConstants {
        static final String name = "Rey Lane";
        static final TileGroup group = TileGroup.PURPLE;
        static final double price = 160d;
        static final double defaultFine = 12d;
        static final double level1Price = 100d;
        static final double level1Fine = 60d;
        static final double level2Price = 100d;
        static final double level2Fine = 180d;
        static final double level3Price = 100d;
        static final double level3Fine = 500d;
        static final double level4Price = 100d;
        static final double level4Fine = 700d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 900d;
    }
    public ReyLane(int position) {
        super(WookieHoleConstants.name, position, WookieHoleConstants.group, WookieHoleConstants.price, WookieHoleConstants.defaultFine, WookieHoleConstants.level1Price, WookieHoleConstants.level1Fine, WookieHoleConstants.level2Price, WookieHoleConstants.level2Fine, WookieHoleConstants.level3Price, WookieHoleConstants.level3Fine, WookieHoleConstants.level4Price, WookieHoleConstants.level4Fine, WookieHoleConstants.hotelPrice, WookieHoleConstants.hotelFine);
    }
}
