package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class Jail extends Tile {
    static class JailConstants {
        static final String name = "Jail";
        static final TileGroup group = TileGroup.JAIL;
    }

    public Jail(int position) {
        super(JailConstants.name, position, JailConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return player;
    }
}
