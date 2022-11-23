package oops.ood.swiggy.v2;

public class MenuItem {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayItem() {

        System.out.println(name +"     "+price);
    }

}