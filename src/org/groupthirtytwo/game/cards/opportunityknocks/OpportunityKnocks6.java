package org.groupthirtytwo.game.cards.opportunityknocks;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.cards.OpportunityKnocks;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;

public class OpportunityKnocks6 extends OpportunityKnocks {
    public OpportunityKnocks6() {
        super("Take a trip to Hove station. If you pass GO collect £200"
        );
    }

    @Override
    public Player landingEvent(Player player) {
        Tile tile = Game.get().getTileManager().getTile("Hove Station");
        if (player.getPosition() > tile.getPosition()) {
            Game.get().getBank().withdraw(200d, player);
        }
        return player.setPosition(tile.getPosition());
    }
}
