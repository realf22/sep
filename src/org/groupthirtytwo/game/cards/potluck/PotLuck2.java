package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck2 extends PotLuck {
    public PotLuck2() {
        super("You have won 2nd prize in a beauty contest, collect £50");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(50d, player);
        return player;
    }
}
