package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class BishopDrive extends Property {
    static class BishopDriveConstants {
        static final String name = "Bishop Drive";
        static final TileGroup group = TileGroup.ORANGE;
        static final double price = 180d;
        static final double defaultFine = 14d;
        static final double level1Price = 100d;
        static final double level1Fine = 70d;
        static final double level2Price = 100d;
        static final double level2Fine = 200d;
        static final double level3Price = 100d;
        static final double level3Fine = 550d;
        static final double level4Price = 100d;
        static final double level4Fine = 750d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 950d;
    }
    public BishopDrive(int position) {
        super(BishopDriveConstants.name, position, BishopDriveConstants.group, BishopDriveConstants.price, BishopDriveConstants.defaultFine, BishopDriveConstants.level1Price, BishopDriveConstants.level1Fine, BishopDriveConstants.level2Price, BishopDriveConstants.level2Fine, BishopDriveConstants.level3Price, BishopDriveConstants.level3Fine, BishopDriveConstants.level4Price, BishopDriveConstants.level4Fine, BishopDriveConstants.hotelPrice, BishopDriveConstants.hotelFine);
    }
}
