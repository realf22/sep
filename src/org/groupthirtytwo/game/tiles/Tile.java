package org.groupthirtytwo.game.tiles;

import org.groupthirtytwo.game.players.Player;

/**
 * Tile,
 * represents a tile object on the board.
 */
public abstract class Tile {
    // Property group
    final TileGroup group;

    final int position;

    // Property name
    final String name;


    public Tile(String name, int position, TileGroup group) {
        this.name = name;
        this.position = position;
        this.group = group;
        this.group.registerTile(this);
    }

    /**
     * Event for when a player lands on this tile
     * @return
     */
    public abstract Player landingEvent(Player player);

    // Getters
    public String getName() {
        return name;
    }

    public TileGroup getGroup() {
        return group;
    }

    public int getPosition() {
        return position;
    }
}

