package fr.ynov.cookieClicker.shop;

import fr.ynov.cookieClicker.item.item;

import java.util.Arrays;
import java.util.List;

public class shop {
    List<item> ListItem;

    public shop(item object1, item object2, item object3) {
        this.ListItem =  Arrays.asList(object1, object2, object3);
    }

    public List<item> getListItem() {
        return ListItem;
    }
}
