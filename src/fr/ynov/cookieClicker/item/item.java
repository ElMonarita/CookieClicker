package fr.ynov.cookieClicker.item;

public class item {
    private int price;
    protected int GainCookie;
    private String nameItems;

    public item(final int price, final int GainCookie, final String nameItems) {
        this.price = price;
        this.GainCookie = GainCookie;
        this.nameItems = nameItems;
    }
    public void IncreaseGainCookie() {
        this.GainCookie = this.GainCookie+10;
    }
    public int getGainCookie() {
        return GainCookie;
    }
    public int getPrice() {
        return this.price;
    }
    public String getName(){
        return this.nameItems;
    }
    public void IncreasePrice() {
        this.price = this.price * 2;
    }

}
