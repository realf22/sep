package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class GrangerDrive extends Property {
    static class GrangerDriveConstants {
        static final String name = "Granger Drive";
        static final TileGroup group = TileGroup.CYAN;
        static final double price = 120d;
        static final double defaultFine = 8d;
        static final double level1Price = 50d;
        static final double level1Fine = 40d;
        static final double level2Price = 50d;
        static final double level2Fine = 10d;
        static final double level3Price = 50d;
        static final double level3Fine = 300d;
        static final double level4Price = 50d;
        static final double level4Fine = 450d;
        static final double hotelPrice = 50d;
        static final double hotelFine = 600d;
    }
    public GrangerDrive(int position) {
        super(GrangerDriveConstants.name, position, GrangerDriveConstants.group, GrangerDriveConstants.price, GrangerDriveConstants.defaultFine, GrangerDriveConstants.level1Price, GrangerDriveConstants.level1Fine, GrangerDriveConstants.level2Price, GrangerDriveConstants.level2Fine, GrangerDriveConstants.level3Price, GrangerDriveConstants.level3Fine, GrangerDriveConstants.level4Price, GrangerDriveConstants.level4Fine, GrangerDriveConstants.hotelPrice, GrangerDriveConstants.hotelFine);
    }
}
