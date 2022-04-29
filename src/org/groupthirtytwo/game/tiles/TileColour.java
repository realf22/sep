package org.groupthirtytwo.game.tiles;

import java.awt.*;

/**
 * Property colour enum,
 * Unique to each property group,
 * Used to colour the properties on the board.
 */
public enum TileColour {
    // INSERT COLOURS
    WHITE("White", Color.WHITE),
    BR0WN("Brown", Color.BLACK),
    CYAN("Cyan", Color.CYAN),
    BLUE("Blue", Color.BLUE),
    PURPLE("Purple", Color.MAGENTA),
    GREY("Grey", Color.GRAY),
    ORANGE("Orange", Color.ORANGE),
    RED("Red", Color.RED),
    YELLOW("Yellow", Color.YELLOW),
    GREEN("Green", Color.GREEN),
    PINK("Pink", Color.PINK);

    // Colour strings that store the string colour, then the java color data
    final String colour;
    final Color colourData;

    TileColour(String colour, Color colourData) {
        this.colour = colour;
        this.colourData = colourData;
    }

    public String getColour() {
        return colour;
    }

    public Color getColourData() {
        return colourData;
    }
}
