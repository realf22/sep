package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck1 extends PotLuck {
    public PotLuck1() {
        super("You Inherit £200");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(200d, player);
        return player;
    }
}
