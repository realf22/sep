package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck3 extends PotLuck {
    public PotLuck3() {
        super("You are up a creek without a paddle, go back to Old Creek.");
    }

    @Override
    public Player landingEvent(Player player) {
        return player.setPosition(Game.get().getTileManager().getTile("The Old Creek").getPosition());
    }
}
