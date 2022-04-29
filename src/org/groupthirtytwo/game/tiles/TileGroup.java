package org.groupthirtytwo.game.tiles;

import org.groupthirtytwo.game.players.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Property Groups,
 * Each property belongs to a group of properties of indefinite size,
 * Stores information about the property groups.
 */
public enum TileGroup {
    GO("Go", TileColour.WHITE),
    SUPER_TAX("Super Tax", TileColour.WHITE),
    INCOME_TAX("Income Tax", TileColour.WHITE),
    JAIL("Jail", TileColour.WHITE),
    GO_TO_JAIL("Go To Jail", TileColour.WHITE),
    FREE_PARKING("Free Parking", TileColour.WHITE),
    STATIONS("Stations", TileColour.GREY),
    UTILITIES("Utilities", TileColour.GREY),
    BROWN("Brown", TileColour.BR0WN),
    CYAN("Cyan", TileColour.CYAN),
    PURPLE("Purple", TileColour.PURPLE),
    ORANGE("Orange", TileColour.ORANGE),
    RED("Red", TileColour.RED),
    YELLOW("Yellow", TileColour.YELLOW),
    GREEN("Green", TileColour.GREEN),
    BLUE("Blue", TileColour.BLUE),
    POT_LUCK("Pot Luck", TileColour.WHITE), OPPORTUNITY_KNOCKS("Opportunity Knocks", TileColour.WHITE);

    // The name of this property group
    final String name;

    //
    final TileColour colour;

    List<Tile> tiles;

    TileGroup(String name, TileColour colour) {
        this.name = name;
        this.colour = colour;
        this.tiles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public TileColour getColour() {
        return colour;
    }

    /**
     * Registers a tile as being of this property group
     * @param tile
     */
    public void registerTile(Tile tile) {
        if (tiles.contains(tile)) return;
        tiles.add(tile);
    }

    /**
     * Returns the owners of this property group
     * @return
     */
    List<Player> getOwners() {
        return this.tiles.stream().filter(e -> e instanceof Property).map(e -> ((Property) e).getOwner()).toList();
    }

    public int getTileCount() {
        return this.tiles.size();
    }
}
