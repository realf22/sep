package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.tiles.Utilities;

public class TeslaPowerCo extends Utilities {
    static class TeslaPowerCoConstants {
        static final String name = "Tesla Power Company";
    }
    public TeslaPowerCo(int position) {
        super(TeslaPowerCoConstants.name, position);
    }
}
