package fr.ynov.cookieClicker.item.buildings;

import fr.ynov.cookieClicker.item.item;

public class buildings extends item {

    private int quantity;

    public buildings(int quantity, int price, int GainCookie, String nameItems) {
        super(price, GainCookie, nameItems);
        this.quantity = quantity;
    }

    public void IncreaseQuantity() {
        this.quantity++;
    }

    @Override
    public void IncreaseGainCookie() {
        this.GainCookie = this.GainCookie * this.quantity;
    }
    @Override
    public int getGainCookie() {
        return this.GainCookie* this.quantity;
    }
    public int getQuantity() {
        return quantity;
    }
}
