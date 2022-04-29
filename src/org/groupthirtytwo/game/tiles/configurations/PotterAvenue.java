package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Property;
import org.groupthirtytwo.game.tiles.TileGroup;

public class PotterAvenue extends Property {
    static class PotterAvenueConstants {
        static final String name = "Potter Avenue";
        static final TileGroup group = TileGroup.CYAN;
        static final double price = 100d;
        static final double defaultFine = 6d;
        static final double level1Price = 50d;
        static final double level1Fine = 30d;
        static final double level2Price = 50d;
        static final double level2Fine = 90d;
        static final double level3Price = 50d;
        static final double level3Fine = 270d;
        static final double level4Price = 50d;
        static final double level4Fine = 400d;
        static final double hotelPrice = 50d;
        static final double hotelFine = 550d;
    }
    public PotterAvenue(int position) {
        super(PotterAvenueConstants.name, position, PotterAvenueConstants.group, PotterAvenueConstants.price, PotterAvenueConstants.defaultFine, PotterAvenueConstants.level1Price, PotterAvenueConstants.level1Fine, PotterAvenueConstants.level2Price, PotterAvenueConstants.level2Fine, PotterAvenueConstants.level3Price, PotterAvenueConstants.level3Fine, PotterAvenueConstants.level4Price, PotterAvenueConstants.level4Fine, PotterAvenueConstants.hotelPrice, PotterAvenueConstants.hotelFine);
    }
}
