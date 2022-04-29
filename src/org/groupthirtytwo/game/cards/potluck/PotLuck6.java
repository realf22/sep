package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck6 extends PotLuck {
    public PotLuck6() {
        super("Mega late night taxi bill, pay £50");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(50d, player);
        return player;
    }
}
