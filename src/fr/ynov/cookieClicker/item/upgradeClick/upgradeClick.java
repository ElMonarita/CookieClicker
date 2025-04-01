package fr.ynov.cookieClicker.item.upgradeClick;

import fr.ynov.cookieClicker.item.item;

public class upgradeClick extends item {

    private int level;

    public upgradeClick(final int level, int price, int GainCookie, String nameItems) {
        super(price, GainCookie, nameItems);
        this.level = level;
    }
    public void IncreaseLevel() {
        this.level++;
    }
    public int getLevel() {
        return this.level;
    }

}
