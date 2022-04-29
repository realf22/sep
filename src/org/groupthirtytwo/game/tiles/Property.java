package org.groupthirtytwo.game.tiles;

import org.groupthirtytwo.game.players.Player;

import java.util.List;
import java.util.Set;

/**
 * A Property,
 * This represents a purchase-able property within the game,
 * Belongs to a property group.
 */
public abstract class Property extends Tile {

    public static class PropertyConstants {
        public static int HOUSES_PER_HOTEL = 4;
        public static int MAX_HOTELS = 1;
        public static int MIN_HOUSES = 0;
        public static int MIN_HOTELS = 0;
    }

    // Price of property and upgrades
    final double price;
    final double defaultFine;
    final double level1Price;
    final double level1Fine;
    final double level2Price;
    final double level2Fine;
    final double level3Price;
    final double level3Fine;
    final double level4Price;
    final double level4Fine;
    final double hotelPrice;
    final double hotelFine;
    Player owner;

    // Post purchase properties
    int houses = 0;
    int hotels = 0;

    public Property(String name, int position, TileGroup group, double price, double defaultFine, double level1Price, double level1Fine, double level2Price, double level2Fine, double level3Price, double level3Fine,double level4Price, double level4Fine, double hotelPrice, double hotelFine) {
        super(name, position, group);
        this.price = price;
        this.defaultFine = defaultFine;
        this.level1Price = level1Price;
        this.level1Fine = level1Fine;
        this.level2Price = level2Price;
        this.level2Fine = level2Fine;
        this.level3Price = level3Price;
        this.level3Fine = level3Fine;
        this.level4Price = level4Price;
        this.level4Fine = level4Fine;
        this.hotelPrice = hotelPrice;
        this.hotelFine = hotelFine;
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        if (!player.equals(this.getOwner()) && this.isOwned()) {
            player.transfer(this.getFine(), this.getOwner());
        }
        return player;
    }

    /**
     * Returns if all properties in the group are owned by the same player
     * @return
     */
    boolean isGroupOwned() {
        List<Player> owners = group.getOwners();
        if (owners.size() != group.getTileCount()) return false;
        return Set.copyOf(owners).size() == 1;
    }

    /**
     * Returns if the property has an owner
     * @return
     */
    public boolean isOwned() {
        return this.getOwner() != null;
    }

    // Fine Methods

    /**
     * Returns the current payable fine for this property.
     * @return
     */
    public double getFine() {
        if (hotels > 0) {
            return hotelFine;
        }

        if (canAddHouse()) {
            if (houses == 0) {
                if (isGroupOwned()) {
                    return defaultFine * 2d;
                }
                return defaultFine;
            };
            if (houses == 1) return level1Fine;
            if (houses == 2) return level2Fine;
            if (houses == 3) return level3Fine;
            if (houses == 4) return level4Fine;
        }

        return Double.MAX_VALUE;
    }

    // Up & Down grade Methods
    /**
     * Returns if this property can have another house added
     * @return boolean
     */
    public boolean canAddHouse() {
        return houses < PropertyConstants.HOUSES_PER_HOTEL;
    }

    /**
     * Returns if this property can be house downgraded
     * @return boolean
     */
    public boolean canRemHouse() {
        return hotels < PropertyConstants.MIN_HOTELS && houses > PropertyConstants.MIN_HOUSES;
    }

    /**
     * Returns if this property can have a hotel added
     * @return boolean
     */
    public boolean canAddHotel() {
        return hotels < PropertyConstants.MAX_HOTELS && houses == PropertyConstants.HOUSES_PER_HOTEL && isGroupOwned();
    }

    /**
     * Returns if this property can be hotel downgraded
     * @return
     */
    public boolean canRemHotel() {
        return houses == PropertyConstants.MIN_HOUSES && hotels >= PropertyConstants.MIN_HOTELS;
    }

    /**
     * Returns the current price to upgrade this property
     * If it cannot be upgraded, price is infinite.
     * @return double
     */
    public double getUpgradePrice() {
        if (canAddHotel()) {
            return hotelPrice;
        }

        if (canAddHouse()) {
            if (houses == 0) return level1Price;
            if (houses == 1) return level2Price;
            if (houses == 2) return level3Price;
            if (houses == 3) return level4Price;
        }

        return Double.MAX_VALUE;
    }

    /**
     * Returns the relevant downgrade value
     * @return double
     */
    public double getDowngradeValue() {
        if (canRemHotel()) {
            return hotelPrice;
        }

        if (canRemHouse()) {
            if (houses == 1) return level1Price;
            if (houses == 2) return level2Price;
            if (houses == 3) return level3Price;
            if (houses == 4) return level4Price;
        }

        return 0d;
    }
    // SETTERS
    public Property setOwner(Player player) {
        this.owner = player;
        return this;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public Player getOwner() {
        return owner;
    }

    public int getHotels() {
        return hotels;
    }

    public int getHouses() {
        return houses;
    }

    public double getDefaultFine() {
        return defaultFine;
    }

    public double getLevel1Price() {
        return level1Price;
    }

    public double getLevel1Fine() {
        return level1Fine;
    }

    public double getLevel2Price() {
        return level2Price;
    }

    public double getLevel2Fine() {
        return level2Fine;
    }

    public double getLevel3Price() {
        return level3Price;
    }

    public double getLevel3Fine() {
        return level3Fine;
    }

    public double getLevel4Price() {
        return level4Price;
    }

    public double getLevel4Fine() {
        return level4Fine;
    }

    public double getHotelPrice() {
        return hotelPrice;
    }

    public double getHotelFine() {
        return hotelFine;
    }
}