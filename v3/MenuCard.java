package oops.ood.v3;

import java.util.List;

public class MenuCard {
   private List<MenuItem> menuItems;

    public MenuCard(List<MenuItem> menuItem) {

        this.menuItems = menuItem;
    }

    public void displayMenu() {
        for (MenuItem menuItems : menuItems) {
            menuItems.displayItem();
        }
    }
}