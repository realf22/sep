package org.groupthirtytwo.game.tiles;

import org.groupthirtytwo.game.players.Player;

public abstract class Utilities extends NonUpgradeableProperty {
    static class UtilityConstants {
        static final TileGroup group = TileGroup.UTILITIES;
        static final double price = 150d;
        static final double singleMultiplier = 4;
        static final double doubleMultiplier = 10;
    }
    public Utilities(String name, int position) {
        super(name, position, UtilityConstants.group, UtilityConstants.price, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d);
    }

    /**
     * Returns the number of stations owned by the owner of this station
     * @return
     */
    int getUtilityCount() {
        return (int) this.group.getOwners().stream().filter(e -> e.equals(this.getOwner())).count();
    }


    /**
     * Use #getFine(Player)
     * @return
     */
    @Override
    @Deprecated
    public double getFine() {
        return 0d;
    }

    /**
     * Returns the contextual fine for the given player
     * @param player
     * @return
     */
    public double getFine(Player player) {
        int count = getUtilityCount();
        if (count == 1) return player.getRoll() * UtilityConstants.singleMultiplier;
        if (count == 2) return player.getRoll() * UtilityConstants.doubleMultiplier;
        return 0d;
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
            player.transfer(this.getFine(player), this.getOwner());
        }
        return player;
    }
}
