package oops.ood.v3;

public class Hotel {
    private String name;
    private String phno;
    private String type;
    private String location;

    public Hotel(String name, String phno, String type, String location) {
        this.name = name;
        this.phno = phno;
        this.type = type;
        this.location = location;
    }
    public void displayMenu() {
        System.out.println("Hotel "+name);
        //MenuCard;
    }
}
