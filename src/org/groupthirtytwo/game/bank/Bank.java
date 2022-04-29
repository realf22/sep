package org.groupthirtytwo.game.bank;

import org.groupthirtytwo.game.players.Player;

public class Bank {
    double balance;
    double fines;

    public Bank(double startingBalance) {
        this.balance = startingBalance;
        this.fines = 0;
    }

    /**
     * Transfers fines cash from bank to <player>
     * @param player
     * @return this
     */
    public Bank withdrawFine(Player player) {
        player.deposit(this.fines);
        return setFines(0);
    }

    /**
     * Transfers <amount> cash from <player> to bank in fines
     * @param amount
     * @param player
     * @return this
     */
    public Bank depositFine(double amount, Player player) {
        player.withdraw(amount);
        return setFines(this.getFines() + amount);
    }

    /**
     * Transfers <amount> cash from bank to <player>
     * @param amount
     * @param player
     * @return this
     */
    public Bank withdraw(double amount, Player player) {
        player.deposit(amount);
        return setBalance(this.getBalance() - amount);
    }

    /**
     * Transfers <amount> cash from <player> to bank
     * @param amount
     * @param player
     * @return this
     */
    public Bank deposit(double amount, Player player) {
        player.withdraw(amount);
        return setBalance(this.getBalance() + amount);
    }

    Bank setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    Bank setFines(double balance) {
        this.fines = fines;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public double getFines() {
        return fines;
    }
}
