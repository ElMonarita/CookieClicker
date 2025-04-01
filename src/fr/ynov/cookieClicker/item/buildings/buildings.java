package fr.ynov.cookieClicker.item.buildings;

import fr.ynov.cookieClicker.item.item;

/**
 * Represents a building in the Cookie Clicker game.
 * Buildings generate cookies over time and can be purchased in quantities.
 * This class extends {@link item}.
 *
 * @author BORDES Rémy
 * @version 1.0
 * @since Java 21
 */
public class buildings extends item {

    /** The number of buildings owned by the player. */
    private int quantity;

    /**
     * Constructs a {@code buildings} object with the specified parameters.
     *
     * @param quantity The initial quantity of buildings owned.
     * @param price The cost of the building.
     * @param GainCookie The number of cookies generated per building.
     * @param nameItems The name of the building.
     */
    public buildings(int quantity, int price, int GainCookie, String nameItems) {
        super(price, GainCookie, nameItems);
        this.quantity = quantity;
    }

    /**
     * Increases the quantity of buildings owned by one.
     */
    public void IncreaseQuantity() {
        this.quantity++;
    }

    /**
     * Increases the total cookie generation by multiplying it with the number of buildings owned.
     * Overrides {@link item#IncreaseGainCookie()}.
     */
    @Override
    public void IncreaseGainCookie() {
        this.GainCookie *= this.quantity;
    }

    /**
     * Gets the total number of cookies generated per second based on the number of buildings owned.
     * Overrides {@link item#getGainCookie()}.
     *
     * @return The total cookies generated.
     */
    @Override
    public int getGainCookie() {
        return this.GainCookie * this.quantity;
    }

    /**
     * Gets the quantity of buildings owned.
     *
     * @return The number of buildings.
     */
    public int getQuantity() {
        return quantity;
    }
}