package org.groupthirtytwo.game.tiles;

public abstract class NonUpgradeableProperty extends Property {
    public NonUpgradeableProperty(String name, int position, TileGroup group, double price, double defaultFine, double level1Price, double level1Fine, double level2Price, double level2Fine, double level3Price, double level3Fine, double level4Price, double level4Fine, double hotelPrice, double hotelFine) {
        super(name, position, group, price, defaultFine, level1Price, level1Fine, level2Price, level2Fine, level3Price, level3Fine, level4Price, level4Fine, hotelPrice, hotelFine);
    }

    @Override
    public boolean canAddHotel() {
        return false;
    }

    @Override
    public boolean canAddHouse() {
        return false;
    }

    @Override
    public boolean canRemHotel() {
        return false;
    }

    @Override
    public boolean canRemHouse() {
        return false;
    }

    @Override
    public double getDowngradeValue() {
        return 0d;
    }

    @Override
    public int getHotels() {
        return 0;
    }

    @Override
    public int getHouses() {
        return 0;
    }

    @Override
    public double getUpgradePrice() {
        return 0d;
    }
}
