package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class IbisClose extends Property {
    static class IbisCloseConstants {
        static final String name = "Ghengis Crescent";
        static final TileGroup group = TileGroup.GREEN;
        static final double price = 320d;
        static final double defaultFine = 28d;
        static final double level1Price = 200d;
        static final double level1Fine = 150d;
        static final double level2Price = 200d;
        static final double level2Fine = 450d;
        static final double level3Price = 200d;
        static final double level3Fine = 1000d;
        static final double level4Price = 200d;
        static final double level4Fine = 1200d;
        static final double hotelPrice = 200d;
        static final double hotelFine = 1400d;
    }
    public IbisClose(int position) {
        super(IbisCloseConstants.name, position, IbisCloseConstants.group, IbisCloseConstants.price, IbisCloseConstants.defaultFine, IbisCloseConstants.level1Price, IbisCloseConstants.level1Fine, IbisCloseConstants.level2Price, IbisCloseConstants.level2Fine, IbisCloseConstants.level3Price, IbisCloseConstants.level3Fine, IbisCloseConstants.level4Price, IbisCloseConstants.level4Fine, IbisCloseConstants.hotelPrice, IbisCloseConstants.hotelFine);
    }
}
