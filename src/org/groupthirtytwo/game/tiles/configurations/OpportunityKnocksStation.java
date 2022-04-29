package org.groupthirtytwo.game.tiles.configurations;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.players.Player;
import org.groupthirtytwo.game.tiles.Tile;
import org.groupthirtytwo.game.tiles.TileGroup;

public class OpportunityKnocksStation extends Tile {
    static class OpportunityKnocksConstants {
        static final String name = "Opportunity Knocks" ;
        static final TileGroup group = TileGroup.OPPORTUNITY_KNOCKS;
    }

    public OpportunityKnocksStation(int position) {
        super(OpportunityKnocksConstants.name, position, OpportunityKnocksConstants.group);
    }

    /**
     * Event for when a player lands on this tile
     *
     * @param player
     * @return
     */
    @Override
    public Player landingEvent(Player player) {
        return Game.get().getOpportunityKnocksManager().drawCard().landingEvent(player);
    }
}
