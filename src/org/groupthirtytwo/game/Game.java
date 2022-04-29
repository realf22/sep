package org.groupthirtytwo.game;

import org.groupthirtytwo.game.bank.Bank;
import org.groupthirtytwo.game.cards.OpportunityKnocksManager;
import org.groupthirtytwo.game.cards.PotLuckManager;
import org.groupthirtytwo.game.dice.Dice;
import org.groupthirtytwo.game.players.PlayerManager;
import org.groupthirtytwo.game.tiles.TileManager;

public class Game {
    static class GameConstants {
        static double startingCash = 1500d;
        static double bankStartingCash = 50000d;
    }
    static Game game;
    TileManager tileManager;
    PlayerManager playerManager;
    OpportunityKnocksManager opportunityKnocksManager;
    PotLuckManager potLuckManager;
    Dice dice;
    Bank bank;


    public Game() {
        // Set singleton getter
        game = this;

        // Create tilemanager, this also creates all tiles on the board.
        tileManager = new TileManager();
        dice = new Dice();
        playerManager = new PlayerManager();
        this.potLuckManager = new PotLuckManager();
        this.opportunityKnocksManager = new OpportunityKnocksManager();
        this.bank = new Bank(GameConstants.bankStartingCash);
    }


    public static void main(String[] args) {
        // Nothing
        // Game mainloop
        // Create player stuff
        // Initiate game
        // Loop while players > 1
        // If any player is bankrupt at the end of their turn, they lose. rip.
    }


    /**
     * Returns the tile manager
     * @return TileManager
     */
    public TileManager getTileManager() {
        return tileManager;
    }

    /**
     * Returns the bank
     * @return TileManager
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * Returns the dice
     * @return TileManager
     */
    public Dice getDice() {
        return dice;
    }

    /**
     * Returns the player manager
     * @return TileManager
     */
    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    /**
     * Returns the active game
     * @return Game
     */
    public static Game get() {
        return game;
    }


    /**
     * Returns the OpportunityKnocksManager
     * @return Game
     */
    public OpportunityKnocksManager getOpportunityKnocksManager() {
        return opportunityKnocksManager;
    }

    /**
     * Returns the PotLuckManager
     * @return Game
     */
    public PotLuckManager getPotLuckManager() {
        return potLuckManager;
    }
}
