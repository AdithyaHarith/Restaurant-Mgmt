package oops.ood.swiggy.v2;

public class Hotel {
    private String name;
    private String location;
    private String phno;
    private String type;

    private MenuCard menuCard;

    public Hotel(String name, String location, String phno, String type, MenuCard menuCard) {
        this.name = name;
        this.location = location;
        this.phno = phno;
        this.type = type;
        this.menuCard=menuCard;
    }

    public void displayMenu() {
        System.out.println("Hotel "+name);
        menuCard.displayMenuCard();
    }
}
