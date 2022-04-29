package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class PotLuckStation extends Tile {
    static class PotLuckConstants {
        static final String name = "Pot Luck";
        static final TileGroup group = TileGroup.POT_LUCK;
    }

    public PotLuckStation(int position) {
        super(PotLuckConstants.name, position, PotLuckConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return Game.get().getPotLuckManager().drawCard().landingEvent(player);
    }
}
