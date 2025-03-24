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

    public String getName() {
        return name;
    }

    public void updateGainCookiePerSec(int cookieClick, int cookieBuildings) {
        this.gainCookiePerSec = cookieClick + cookieBuildings;
    }

    public int getCookieMonney() {
        return this.cookieMonney;
    }
    public int getGainCookiePerSec() {
        return this.gainCookiePerSec;
    }
}
