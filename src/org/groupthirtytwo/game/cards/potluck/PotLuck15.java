package org.groupthirtytwo.game.cards.potluck;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.PotLuck;
import org.groupthirtytwo.game.players.Player;

public class PotLuck15 extends PotLuck {
    public PotLuck15() {
        super("It's your birthday, collect £10 from each player.");
    }

    @Override
    public Player landingEvent(Player player) {
        for (Player tempPlayer : Game.get().getPlayerManager().getPlayers()) {
            tempPlayer.transfer(10d, player);
        }
        return player;
    }
}
