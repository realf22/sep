package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class JamesWebbWay extends Property {
    static class JamesWebbWayConstants {
        static final String name = "James Webb Way";
        static final TileGroup group = TileGroup.BLUE;
        static final double price = 350d;
        static final double defaultFine = 35d;
        static final double level1Price = 200d;
        static final double level1Fine = 175d;
        static final double level2Price = 200d;
        static final double level2Fine = 500d;
        static final double level3Price = 200d;
        static final double level3Fine = 1100d;
        static final double level4Price = 200d;
        static final double level4Fine = 1300d;
        static final double hotelPrice = 200d;
        static final double hotelFine = 1500d;
    }
    public JamesWebbWay(int position) {
        super(JamesWebbWayConstants.name, position, JamesWebbWayConstants.group, JamesWebbWayConstants.price, JamesWebbWayConstants.defaultFine, JamesWebbWayConstants.level1Price, JamesWebbWayConstants.level1Fine, JamesWebbWayConstants.level2Price, JamesWebbWayConstants.level2Fine, JamesWebbWayConstants.level3Price, JamesWebbWayConstants.level3Fine, JamesWebbWayConstants.level4Price, JamesWebbWayConstants.level4Fine, JamesWebbWayConstants.hotelPrice, JamesWebbWayConstants.hotelFine);
    }
}
