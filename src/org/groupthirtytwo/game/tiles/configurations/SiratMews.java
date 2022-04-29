package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class SiratMews extends Property {
    static class SiratMewsConstants {
        static final String name = "Sirat Mews";
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
    public SiratMews(int position) {
        super(SiratMewsConstants.name, position, SiratMewsConstants.group, SiratMewsConstants.price, SiratMewsConstants.defaultFine, SiratMewsConstants.level1Price, SiratMewsConstants.level1Fine, SiratMewsConstants.level2Price, SiratMewsConstants.level2Fine, SiratMewsConstants.level3Price, SiratMewsConstants.level3Fine, SiratMewsConstants.level4Price, SiratMewsConstants.level4Fine, SiratMewsConstants.hotelPrice, SiratMewsConstants.hotelFine);
    }
}
