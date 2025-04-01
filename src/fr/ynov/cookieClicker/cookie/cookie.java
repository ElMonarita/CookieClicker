package fr.ynov.cookieClicker.cookie;

public class cookie {
    private int gainClick;

    public cookie (final int gainClick) {
        this.gainClick = gainClick;
    }

    public void IncreasegainClick(int gainClickWithUp) {
        this.gainClick = gainClick + gainClickWithUp;
    }


    public int getGainClick() {
        return this.gainClick;
    }

}
