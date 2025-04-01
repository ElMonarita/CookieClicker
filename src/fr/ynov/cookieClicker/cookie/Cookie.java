package fr.ynov.cookieClicker.cookie;

/**
 * Represents a cookie in the Cookie Clicker game.
 * This class manages the number of cookies gained per click.
 *
 * @author BORDES Rémy
 * @version 1.0
 * @since Java 21
 */
public class Cookie {

    /** The number of cookies gained per click. */
    private int gainClick;

    /**
     * Constructs a {@code cookie} with the specified initial gain per click.
     *
     * @param gainClick The number of cookies earned per click.
     */
    public Cookie(final int gainClick) {
        this.gainClick = gainClick;
    }

    /**
     * Increases the number of cookies gained per click by a specified amount.
     *
     * @param gainClickWithUp The additional cookies earned per click after an upgrade.
     */
    public void IncreasegainClick(int gainClickWithUp) {
        this.gainClick += gainClickWithUp;
    }

    /**
     * Gets the number of cookies gained per click.
     *
     * @return The current gain per click.
     */
    public int getGainClick() {
        return this.gainClick;
    }
}