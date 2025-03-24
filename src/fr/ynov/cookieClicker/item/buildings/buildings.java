package fr.ynov.cookieClicker.item.buildings;

import fr.ynov.cookieClicker.item.item;

public class buildings extends item {

    private int quantity;
    private int nbrCookie;

    public buildings(int quantity, int price, int GainCookie, String nameItems) {
        super(price, GainCookie, nameItems);
        this.quantity = quantity;
        this.nbrCookie = 0;
    }

    public void IncreaseQuantity() {
        this.quantity++;
    }

    @Override
    public void IncreaseGainCookie() {
        this.GainCookie = this.GainCookie * this.quantity;
    }

    public void setNbrCookie() {
        this.nbrCookie += this.GainCookie;
    }
    public int getNbrCookie() {
        return this.nbrCookie;
    }
}
