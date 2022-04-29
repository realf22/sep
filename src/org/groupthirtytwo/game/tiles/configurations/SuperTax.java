package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class SuperTax extends Tile {
    static class SuperTaxConstants {
        static final String name = "Super Tax";
        static final TileGroup group = TileGroup.SUPER_TAX;
        static final double fine = 100d;
    }

    public SuperTax(int position) {
        super(SuperTaxConstants.name, position, SuperTaxConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return player.withdraw(SuperTaxConstants.fine);
    }
}
