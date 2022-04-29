package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck12 extends PotLuck {
    public PotLuck12() {
        super("Savings bond matures, collect £100.");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(100d, player);
        return player;
    }
}
