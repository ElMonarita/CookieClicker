package fr.ynov.cookieClicker.item.upgradeClick;

import fr.ynov.cookieClicker.item.Item;

/**
 * Represents an upgrade for the click action in the Cookie Clicker game.
 * This class extends {@link Item} and adds a leveling system.
 *
 * @author BORDES Rémy
 * @version 1.0
 * @since Java 21
 */

public class UpgradeClick extends Item {

    /** The current level of the upgrade. */
    private int level;

    /**
     * Constructs an {@code upgradeClick} with the specified parameters.
     *
     * @param level The initial level of the upgrade.
     * @param price The cost of the upgrade.
     * @param GainCookie The number of cookies gained per click.
     * @param nameItems The name of the upgrade item.
     */
    public UpgradeClick(final int level, int price, int GainCookie, String nameItems) {
        super(price, GainCookie, nameItems);
        this.level = level;
    }

    /**
     * Increases the level of the upgrade by one.
     */
    public void IncreaseLevel() {
        this.level++;
    }

    /**
     * Gets the current level of the upgrade.
     *
     * @return The current level.
     */
    public int getLevel() {
        return this.level;
    }
}