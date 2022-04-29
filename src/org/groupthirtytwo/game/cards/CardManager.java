package org.groupthirtytwo.game.cards;

import java.util.List;
import java.util.SplittableRandom;

public abstract class CardManager {
    List<Card> cards;
    SplittableRandom random;

    public CardManager() {
        this.random = new SplittableRandom();
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card drawCard() {
        return this.cards.get(random.nextInt(0, this.cards.size()));
    }
}
