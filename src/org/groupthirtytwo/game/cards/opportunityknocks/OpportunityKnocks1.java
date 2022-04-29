package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnocks1 extends OpportunityKnocks {
    public OpportunityKnocks1() {
        super("Bank pays you dividend of £50");
    }

    @Override
    public Player landingEvent(Player player) {
        Game.get().getBank().withdraw(50d, player);
        return player;
    }
}
