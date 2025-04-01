package fr.ynov.cookieClicker.player;

/**
 * Represents a player in the Cookie Clicker game.
 * The player has a name, earns cookies per second, and holds a cookie balance.
 *
 * @author BORDES Rémy
 * @version 1.0
 * @since Java 21
 */
public class Player {

    /** The name of the player. */
    private String name;

    /** The number of cookies earned per second. */
    private int gainCookiePerSec;

    /** The player's current cookie balance. */
    private int cookieMonney;

    /**
     * Constructs a {@code player} with the specified name, cookie gain per second, and initial cookie balance.
     *
     * @param name The player's name.
     * @param gainCookiePerSec The number of cookies the player gains per second.
     * @param cookieMonney The initial amount of cookies the player has.
     */
    public Player(String name, int gainCookiePerSec, int cookieMonney) {
        this.name = name;
        this.gainCookiePerSec = gainCookiePerSec;
        this.cookieMonney = cookieMonney;
    }

    /**
     * Sets the player's name.
     *
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the player's name.
     *
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Increases the player's cookie balance by the specified amount.
     *
     * @param cookieClick The number of cookies to add.
     */
    public void increaseCookieMoney(int cookieClick) {
        this.cookieMonney += cookieClick;
    }

    /**
     * Checks if the player has enough cookies to make a purchase.
     *
     * @param cookieClick The price of the item.
     * @return {@code true} if the player has enough cookies, {@code false} otherwise.
     */
    public boolean possibilityPurchase(int cookieClick) {
        return this.cookieMonney >= cookieClick;
    }

    /**
     * Deducts the specified price from the player's cookie balance when purchasing an item.
     *
     * @param price The cost of the item.
     */
    public void purchaseItems(int price) {
        this.cookieMonney -= price;
    }

    /**
     * Gets the player's current cookie balance.
     *
     * @return The current amount of cookies.
     */
    public int getCookieMonney() {
        return this.cookieMonney;
    }

    /**
     * Gets the number of cookies the player earns per second.
     *
     * @return The cookies earned per second.
     */
    public int getGainCookiePerSec() {
        return this.gainCookiePerSec;
    }
}