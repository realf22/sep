package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class SkywalkerDrive extends Property {
    static class SkywalkerDriveConstants {
        static final String name = "Skywalker Drive";
        static final TileGroup group = TileGroup.PURPLE;
        static final double price = 140d;
        static final double defaultFine = 10d;
        static final double level1Price = 100d;
        static final double level1Fine = 50d;
        static final double level2Price = 100d;
        static final double level2Fine = 150d;
        static final double level3Price = 100d;
        static final double level3Fine = 450d;
        static final double level4Price = 100d;
        static final double level4Fine = 625d;
        static final double hotelPrice = 100d;
        static final double hotelFine = 750d;
    }
    public SkywalkerDrive(int position) {
        super(SkywalkerDriveConstants.name, position, SkywalkerDriveConstants.group, SkywalkerDriveConstants.price, SkywalkerDriveConstants.defaultFine, SkywalkerDriveConstants.level1Price, SkywalkerDriveConstants.level1Fine, SkywalkerDriveConstants.level2Price, SkywalkerDriveConstants.level2Fine, SkywalkerDriveConstants.level3Price, SkywalkerDriveConstants.level3Fine, SkywalkerDriveConstants.level4Price, SkywalkerDriveConstants.level4Fine, SkywalkerDriveConstants.hotelPrice, SkywalkerDriveConstants.hotelFine);
    }
}
