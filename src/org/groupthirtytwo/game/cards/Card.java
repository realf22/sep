package org.groupthirtytwo.game.cards;

import org.groupthirtytwo.game.players.Player;

public abstract class Card {
    String description;

    public Card(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract Player landingEvent(Player player);
}
