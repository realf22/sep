package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;

public class OpportunityKnocks4 extends OpportunityKnocks {
    public OpportunityKnocks4() {
        super("Advance to Han Xin Gardens. If you pass GO, collect £200");
    }

    @Override
    public Player landingEvent(Player player) {
        Tile tile = Game.get().getTileManager().getTile("Han Xin Gardens");
        if (player.getPosition() > tile.getPosition()) {
            Game.get().getBank().withdraw(200d, player);
        }
        return player.setPosition(tile.getPosition());
    }
}
