package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnocks7 extends OpportunityKnocks {
    public OpportunityKnocks7() {
        super("Loan matures, collect £150"

        );
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(150d, player);
        return player;
    }
}
