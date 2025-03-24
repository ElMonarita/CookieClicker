package fr.ynov.cookieClicker.cookie;

public class cookie {
    private int nbrCookie;
    private int gainClick;

    public cookie (final int gainClick) {
        this.nbrCookie = 0;
        this.gainClick = gainClick;
    }

    public void IncreasegainClick(int gainClickWithUp) {
        this.gainClick = gainClick + gainClickWithUp;
    }

    public int getGainClick() {
        return this.gainClick;
    }

    public int getNbrCookie() {
        return this.nbrCookie;
    }

}
