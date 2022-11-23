package oops.ood.swiggy.v2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem("rice", 123);
        MenuItem menuItem1 = new MenuItem("noodles", 34);
        MenuItem menuItem2 = new MenuItem("chicken", 50);

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem);
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);

        MenuCard menuCard1 = new MenuCard(menuItems);

        Hotel hotel1 = new Hotel("Bhukari", "chennai", "1236544", "non-veg", menuCard1);
       // hotel1.displayMenu();

        List<MenuItem> menuItems2 = new ArrayList<>();
        menuItems2.add(new MenuItem("mutton gravy", 245));
        menuItems2.add(new MenuItem("fish fry", 200));
        menuItems2.add(new MenuItem("egg masala", 100));

        MenuCard menuCard2 = new MenuCard(menuItems2);

        Hotel hotel2 = new Hotel("Pandian", "Mugappair", "421523", "non-veg", menuCard2);
        hotel2.displayMenu();



        List<MenuItem> menuItems3=new ArrayList<>();
        menuItems3.add(new MenuItem("mutton gravy", 245));
        menuItems3.add(new MenuItem("egg masala", 100));

        Bill bill=new Bill(menuItems3);
        bill.displayBill();

        List<MenuItem> menuItems4=new ArrayList<>();
        menuItems4.add(new MenuItem("fish fry", 200));
        menuItems4.add(new MenuItem("mutton gravy", 245));

        Bill bill1=new Bill(menuItems4);
        bill1.displayBill();
    }
}
