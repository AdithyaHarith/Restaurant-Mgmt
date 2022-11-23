package oops.ood.swiggy.v2;

import java.util.List;

public class MenuCard {
    private List<MenuItem> menuItems;

    public MenuCard(List<MenuItem> menuItems) {

        this.menuItems = menuItems;
    }

    public void displayMenuCard() {
      for(MenuItem menuItems : menuItems) {
          menuItems.displayItem();
      }
    }
}
