package fr.ynov.cookieClicker.player;

public class player {
    private String name;
    private int gainCookiePerSec;
    private int cookieMonney;

    public player(String name, int gainCookiePerSec, int cookieMonney) {
        this.name = name;
        this.gainCookiePerSec = gainCookiePerSec;
        this.cookieMonney = cookieMonney;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void increaseCookieMoney(int cookieClick) {
        this.cookieMonney += cookieClick;
    }
    public boolean possibilityPurchase(int cookieClick) {
        if (this.cookieMonney >= cookieClick) {
            return true;
        }
        return false;
    }
    public void purchaseItems (int price){
        this.cookieMonney -= price;
    }
    public int getCookieMonney() {
        return this.cookieMonney;
    }
    public int getGainCookiePerSec() {
        return this.gainCookiePerSec;
    }
}
