package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class HanXinGardens extends Property {
    static class HanXinGardensConstants {
        static final String name = "Han Xin Gardens";
        static final TileGroup group = TileGroup.RED;
        static final double price = 240d;
        static final double defaultFine = 20d;
        static final double level1Price = 150d;
        static final double level1Fine = 100d;
        static final double level2Price = 150d;
        static final double level2Fine = 300d;
        static final double level3Price = 150d;
        static final double level3Fine = 750d;
        static final double level4Price = 150d;
        static final double level4Fine = 925d;
        static final double hotelPrice = 150d;
        static final double hotelFine = 1100d;
    }
    public HanXinGardens(int position) {
        super(HanXinGardensConstants.name, position, HanXinGardensConstants.group, HanXinGardensConstants.price, HanXinGardensConstants.defaultFine, HanXinGardensConstants.level1Price, HanXinGardensConstants.level1Fine, HanXinGardensConstants.level2Price, HanXinGardensConstants.level2Fine, HanXinGardensConstants.level3Price, HanXinGardensConstants.level3Fine, HanXinGardensConstants.level4Price, HanXinGardensConstants.level4Fine, HanXinGardensConstants.hotelPrice, HanXinGardensConstants.hotelFine);
    }
}
