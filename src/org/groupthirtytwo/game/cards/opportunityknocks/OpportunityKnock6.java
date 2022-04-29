package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnock6 extends OpportunityKnocks {
    public OpportunityKnock6() {
        super("Pay university fees of £150"

        );
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().deposit(150d, player);
        return player;
    }
}
