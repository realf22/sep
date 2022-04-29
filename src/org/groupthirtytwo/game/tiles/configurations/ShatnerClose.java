package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class ShatnerClose extends Property {
    static class ShatnerCloseConstants {
        static final String name = "Shatner Close";
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
    public ShatnerClose(int position) {
        super(ShatnerCloseConstants.name, position, ShatnerCloseConstants.group, ShatnerCloseConstants.price, ShatnerCloseConstants.defaultFine, ShatnerCloseConstants.level1Price, ShatnerCloseConstants.level1Fine, ShatnerCloseConstants.level2Price, ShatnerCloseConstants.level2Fine, ShatnerCloseConstants.level3Price, ShatnerCloseConstants.level3Fine, ShatnerCloseConstants.level4Price, ShatnerCloseConstants.level4Fine, ShatnerCloseConstants.hotelPrice, ShatnerCloseConstants.hotelFine);
    }
}
