package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck9 extends PotLuck {
    public PotLuck9() {
        super("Bitcoin assets fall, pay off Bitcoin short fall.");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(50d, player);
        return player;
    }
}
