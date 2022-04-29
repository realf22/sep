package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck8 extends PotLuck {
    public PotLuck8() {
        super("From sale of bitcoin you get £50");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(50d, player);
        return player;
    }
}
