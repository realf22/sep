package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;

public class OpportunityKnocks3 extends OpportunityKnocks {
    public OpportunityKnocks3() {
        super("Advance to Turing Heights"
        );
    }

    @Override
    public Player landingEvent(Player player) {
        return player.setPosition(Game.get().getTileManager().getTile("Turing Heights").getPosition());
    }
}
