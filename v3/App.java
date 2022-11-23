package oops.ood.v3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MenuItem menuItem=new MenuItem("Egg",100);
        MenuItem menuItem1=new MenuItem("Fish",245);
        MenuItem menuItem2=new MenuItem("Prawn",300);

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem);
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);

        MenuCard menuCard=new MenuCard(menuItems);

        Hotel hotel=new Hotel("Karaikudi","123654","non-veg","Selam");
        hotel.displayMenu();

        Bill bill=new Bill(menuItems);
        bill.displayBill();

    }
}
