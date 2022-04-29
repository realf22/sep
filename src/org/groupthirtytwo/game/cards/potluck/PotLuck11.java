package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck11 extends PotLuck {
    public PotLuck11() {
        super("Pay insurance fee of £50.");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(50d, player);
        return player;
    }
}
