package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class GoToJail extends Tile {
    static class GoToJailConstants {
        static final String name = "Go To Jail";
        static final TileGroup group = TileGroup.GO_TO_JAIL;
    }

    public GoToJail(int position) {
        super(GoToJailConstants.name, position, GoToJailConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return player.setJailed().setPosition(this.getPosition());
    }
}
