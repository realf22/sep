package org.groupthirtytwo.game.players;

import org.groupthirtytwo.game.Game;
import org.groupthirtytwo.game.tiles.Property;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Player,
 * Represents the player.
 */
public class Player {
    // The player's name
    final String name;

    // The player's colour
    final PlayerColour colour;

    // The player's symbol
    final PlayerToken symbol;

    // The player's balance
    double balance;

    // The player's board position
    int position;

    // Properties
    ArrayList<Property> properties;

    // Player's last rooll
    int roll;

    // Is In Jail?
    boolean jailed;

    Player(String name, double balance, PlayerToken symbol, PlayerColour colour) {
        assert(isNameAllowed(name));
        this.name = name;
        this.balance = balance;
        this.symbol = symbol;
        this.colour = colour;
        this.position = 0;
        this.roll = 0;
        this.jailed = false;
        this.properties = new ArrayList<>();
    }

    public static boolean isNameAllowed(String name) {
        // RUN CHECKS
        if (name.length() > 32) return false;

        // CHECKS OVER
        return true;
    }

    // Movement Methods
    /**
     * Increments the players position by the given <amount>
     * @param amount - The amount to move by
     * @return this
     */
    public Player incrementPosition(int amount) {
        this.position += position;
        if (this.position >= Game.get().getTileManager().getTileCount()) {
            this.position -= Game.get().getTileManager().getTileCount();
        }
        return this;
    }

    // PROPERTY METHODS
    /**
     * Add a property to this player
     * @param property - The property
     * @return this
     */
    public Player addProperty(Property property) {
        if (this.hasProperty(property)) return this;
        this.properties.add(property);
        property.setOwner(this);
        return this;
    }

    /**
     * Removes a property from the player
     * @param property - The property
     * @return this
     */
    public Player remProperty(Property property) {
        if (!this.hasProperty(property)) return this;
        this.properties.remove(property);
        return this;
    }

    /**
     * Returns if this player has the given property in their inventory.
     * @param property - The property
     * @return booolean
     */
    public boolean hasProperty(Property property) {
        return this.properties.contains(property);
    }

    // BALANCE METHODS

    /**
     * Returns if the user can afford to have <amount> withdrawn from their account
     * @param amount - The amount to withdraw
     * @return this
     */
    public boolean canWithdraw(double amount) {
        return this.getBalance() - amount > 0d;
    }

    /**
     * Transfers funds from this account to <owner>
     * @param amount
     * @param owner
     */
    public void transfer(double amount, Player owner) {
        this.withdraw(amount);
        owner.deposit(amount);
    }

    /**
     * Withdraw an amount of cash from this player's balance
     * @param amount - The amount to withdraw
     * @return this
     */
    public Player withdraw(double amount) {
        return this.setBalance(this.getBalance() - amount);
    }

    /**
     * Deposit an amount of cash to this player's balance
     * @param amount - The amount to deposit
     * @return this
     */
    public Player deposit(double amount) {
        return this.setBalance(this.getBalance() + amount);
    }

    // SETTERS
    Player setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public Player setLastRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public Player setJailed() {
        this.jailed = true;
        return this;
    }

    public Player unsetJailed() {
        this.jailed = false;
        return this;
    }

    public Player setPosition(int position) {
        this.position = position;
        return this;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public PlayerColour getColour() {
        return colour;
    }

    public PlayerToken getSymbol() {
        return symbol;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public int getRoll() {
        return roll;
    }

    public int getPosition() {
        return position;
    }

    public boolean isJailed() {
        return jailed;
    }
}

/**
 * Player Colour,
 * Represents the colour of the player on the gui.
 */
enum PlayerColour {
    // INSERT PLAYER SYMBOLS HERE
    BLUE("Blue", Color.BLUE),
    GREEN("Green", Color.GREEN),
    RED("Red", Color.RED),
    YELLOW("Yellow", Color.YELLOW),
    ORANGE("Orange", Color.ORANGE),
    PURPLE("Purple", Color.MAGENTA)
    ;

    // Colour strings that store the string colour, then the java color data
    final String colour;
    final Color colourData;

    PlayerColour(String colour, Color colourData) {
        this.colour = colour;
        this.colourData = colourData;
    }

    public String getColour() {
        return colour;
    }

    public Color getColourData() {
        return colourData;
    }
}

/**
 * Player symbol,
 * Represents the players moveable character, such as a dog or cat.
 */
enum PlayerToken {
    // INSERT PLAYER SYMBOLS HERE
    BOOT("Boot", null),
    SMARTPHONE("Smartphone", null),
    SHIP("Ship", null),
    HATSTAND("Hatstand", null),
    CAT("Cat", null),
    IRON("Iron", null)
    ;

    // The name of the token
    final String name;

    // The loadable asset path to show on the gui / Could be a picture or an instantiable GUI element, whether that be 2d/3d.
    final String assetPath;

    PlayerToken(String name, String assetPath) {
        this.name = name;
        this.assetPath = assetPath;
    }

    public String getName() {
        return name;
    }

    public String getAssetPath() {
        return assetPath;
    }
}