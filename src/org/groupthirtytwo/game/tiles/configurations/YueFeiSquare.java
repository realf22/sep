package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class YueFeiSquare extends Property {
    static class YueFeiSquareConstants {
        static final String name = "Yue Fei Square";
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
    public YueFeiSquare(int position) {
        super(YueFeiSquareConstants.name, position, YueFeiSquareConstants.group, YueFeiSquareConstants.price, YueFeiSquareConstants.defaultFine, YueFeiSquareConstants.level1Price, YueFeiSquareConstants.level1Fine, YueFeiSquareConstants.level2Price, YueFeiSquareConstants.level2Fine, YueFeiSquareConstants.level3Price, YueFeiSquareConstants.level3Fine, YueFeiSquareConstants.level4Price, YueFeiSquareConstants.level4Fine, YueFeiSquareConstants.hotelPrice, YueFeiSquareConstants.hotelFine);
    }
}
