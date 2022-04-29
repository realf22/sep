package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnocks5 extends OpportunityKnocks {
    public OpportunityKnocks5() {
        super("Fined £15 for speeding"
        );
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(15d, player);
        return player;
    }
}
