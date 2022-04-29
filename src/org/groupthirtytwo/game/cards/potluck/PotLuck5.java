package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck5 extends PotLuck {
    public PotLuck5() {
        super("Student bank error in your favour, collect £200");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(200d, player);
        return player;
    }
}
