package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck4 extends PotLuck {
    public PotLuck4() {
        super("Student loan refund, collect £20");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(20d, player);
        return player;
    }
}
