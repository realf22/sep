package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;

public class PotLuck7 extends PotLuck {
    public PotLuck7() {
        super("Advance to go.");
    }

    @Override
    public Player landingEvent(Player player) {
        Tile go = Game.get().getTileManager().getTile("Go");
        go.landingEvent(player);
        return player.setPosition(go.getPosition());
    }
}
