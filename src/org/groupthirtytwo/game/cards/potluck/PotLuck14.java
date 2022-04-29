package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck14 extends PotLuck {
    public PotLuck14() {
        super("Received interest on shares, collect £25.");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(25d, player);
        return player;
    }
}
