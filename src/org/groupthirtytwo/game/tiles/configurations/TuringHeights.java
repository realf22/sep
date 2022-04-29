package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class TuringHeights extends Property {
    static class TuringHeightsConstants {
        static final String name = "Turing Heights";
        static final TileGroup group = TileGroup.BLUE;
        static final double price = 400d;
        static final double defaultFine = 50d;
        static final double level1Price = 200d;
        static final double level1Fine = 200d;
        static final double level2Price = 200d;
        static final double level2Fine = 600d;
        static final double level3Price = 200d;
        static final double level3Fine = 1400d;
        static final double level4Price = 200d;
        static final double level4Fine = 1700d;
        static final double hotelPrice = 200d;
        static final double hotelFine = 2000d;
    }
    public TuringHeights(int position) {
        super(TuringHeightsConstants.name, position, TuringHeightsConstants.group, TuringHeightsConstants.price, TuringHeightsConstants.defaultFine, TuringHeightsConstants.level1Price, TuringHeightsConstants.level1Fine, TuringHeightsConstants.level2Price, TuringHeightsConstants.level2Fine, TuringHeightsConstants.level3Price, TuringHeightsConstants.level3Fine, TuringHeightsConstants.level4Price, TuringHeightsConstants.level4Fine, TuringHeightsConstants.hotelPrice, TuringHeightsConstants.hotelFine);
    }
}
