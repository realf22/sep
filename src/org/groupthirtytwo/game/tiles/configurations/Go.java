package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class Go extends Tile {
    static class GoConstants {
        static final String name = "Go";
        static final TileGroup group = TileGroup.GO;
        static final double reward = 200d;
    }

    public Go(int position) {
        super(GoConstants.name, position, GoConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return player.deposit(GoConstants.reward);
    }
}
