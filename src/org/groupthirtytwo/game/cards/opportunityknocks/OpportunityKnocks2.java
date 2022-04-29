package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnocks2 extends OpportunityKnocks {
    public OpportunityKnocks2() {
        super("You have won a lip sync battle. Collect £100"
        );
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(100d, player);
        return player;
    }
}
