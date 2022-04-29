package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class IncomeTax extends Tile {
    static class IncomeTaxConstants {
        static final String name = "Income Tax";
        static final TileGroup group = TileGroup.INCOME_TAX;
        static final double fine = 200d;
    }

    public IncomeTax(int position) {
        super(IncomeTaxConstants.name, position, IncomeTaxConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return player.withdraw(IncomeTaxConstants.fine);
    }
}
