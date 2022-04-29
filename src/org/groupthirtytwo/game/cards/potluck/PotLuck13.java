package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck13 extends PotLuck {
    public PotLuck13() {
        super("Go to Jail, do not pass go, do not collect £200.");
    }

    @Override
    public Player landingEvent(Player player) {
        player.setJailed();
        return player.setPosition(Game.get().getTileManager().getTile("Go To Jail").getPosition());
    }
}
