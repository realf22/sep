package org.groupthirtytwo.game.cards;

import org.groupthirtytwo.game.cards.potluck.*;

import java.util.ArrayList;

public class PotLuckManager extends CardManager {

    public PotLuckManager() {
        this.cards = new ArrayList<>() {{
            add(new PotLuck1());
            add(new PotLuck2());
            add(new PotLuck3());
            add(new PotLuck4());
            add(new PotLuck5());
            add(new PotLuck6());
            add(new PotLuck7());
            add(new PotLuck8());
            add(new PotLuck9());
            add(new PotLuck10());
            add(new PotLuck11());
            add(new PotLuck12());
            add(new PotLuck13());
            add(new PotLuck14());
            add(new PotLuck15());
        }};
    }

    @Override
    public PotLuck drawCard() {
        return (PotLuck) super.drawCard();
    }
}
