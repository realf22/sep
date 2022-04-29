package org.groupthirtytwo.game.tiles;

public abstract class Station extends NonUpgradeableProperty {
    static class StationConstants {
        static final TileGroup group = TileGroup.STATIONS;
        static final double price = 200d;
        static final double level1Fine = 25d;
        static final double level2Fine = 50d;
        static final double level3Fine = 100d;
        static final double level4Fine = 200d;
    }
    public Station(String name, int position) {
        super(name, position, StationConstants.group, StationConstants.price, 0d, 0d, StationConstants.level1Fine, 0d, StationConstants.level2Fine, 0d, StationConstants.level3Fine, 0d, StationConstants.level4Fine, 0d, 0d);
    }

    /**
     * Returns the number of stations owned by the owner of this station
     * @return
     */
    int getStationCount() {
        return (int) this.group.getOwners().stream().filter(e -> e.equals(this.getOwner())).count();
    }

    @Override
    public double getFine() {
        int count = getStationCount();
        if (count == 1) return level1Fine;
        if (count == 2) return level2Fine;
        if (count == 3) return level3Fine;
        if (count == 4) return level4Fine;
        return 0d;
    }
}
