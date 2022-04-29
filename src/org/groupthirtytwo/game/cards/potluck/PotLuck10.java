package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck10 extends PotLuck {
    public PotLuck10() {
        super("Pay a £10 fee or take opportunity knocks.");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(10d, player);
        return player;
    }
}
