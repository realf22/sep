package org.groupthirtytwo.game.cards;

import org.groupthirtytwo.game.cards.opportunityknocks.*;

import java.util.ArrayList;

public class OpportunityKnocksManager extends CardManager {

    public OpportunityKnocksManager() {
        this.cards = new ArrayList<>() {{
            new OpportunityKnocks1();
            new OpportunityKnocks2();
            new OpportunityKnocks3();
            new OpportunityKnocks4();
            new OpportunityKnocks5();
            new OpportunityKnocks6();
            new OpportunityKnocks7();
        }};
    }

    @Override
    public OpportunityKnocks drawCard() {
        return (OpportunityKnocks) super.drawCard();
    }
}
