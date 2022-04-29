package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class FreeParking extends Tile {
    static class FreeParkingConstants {
        static final String name = "Free Parking";
        static final TileGroup group = TileGroup.FREE_PARKING;
    }

    public FreeParking(int position) {
        super(FreeParkingConstants.name, position, FreeParkingConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdrawFine(player);
        return player;
    }
}
