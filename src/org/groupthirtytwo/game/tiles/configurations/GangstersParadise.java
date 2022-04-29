package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class GangstersParadise extends Property {
    static class GangstersParadiseConstants {
        static final String name = "Gangster's Paradise";
        static final TileGroup group = TileGroup.BROWN;
        static final double price = 60d;
        static final double defaultFine = 4d;
        static final double level1Price = 50d;
        static final double level1Fine = 20d;
        static final double level2Price = 50d;
        static final double level2Fine = 60d;
        static final double level3Price = 50d;
        static final double level3Fine = 180d;
        static final double level4Price = 50d;
        static final double level4Fine = 320d;
        static final double hotelPrice = 50d;
        static final double hotelFine = 450d;
    }
    public GangstersParadise(int position) {
        super(GangstersParadiseConstants.name, position, GangstersParadiseConstants.group, GangstersParadiseConstants.price, GangstersParadiseConstants.defaultFine, GangstersParadiseConstants.level1Price, GangstersParadiseConstants.level1Fine, GangstersParadiseConstants.level2Price, GangstersParadiseConstants.level2Fine, GangstersParadiseConstants.level3Price, GangstersParadiseConstants.level3Fine, GangstersParadiseConstants.level4Price, GangstersParadiseConstants.level4Fine, GangstersParadiseConstants.hotelPrice, GangstersParadiseConstants.hotelFine);
    }
}
