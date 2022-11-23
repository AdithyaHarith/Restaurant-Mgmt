package oops.ood.swiggy;

public class Hotel {
    public int rice;
    public int mutton;
    public int soup;
    public int noodles;
    public int chicken;

    // SOLID -
    // S - Single responsibility
    // O- Open for extension, Closed for modification. Open-Close principle

    public Hotel(int rice, int mutton, int soup, int noodles, int chicken) {
        this.rice = rice;
        this.mutton = mutton;
        this.soup = soup;
        this.noodles = noodles;
        this.chicken = chicken;
    }
    public void displayMenu(){
        System.out.println("Hotal Name Swiggy");
        System.out.println("rice: "+rice );
        System.out.println("mutton: "+mutton );
        System.out.println("soup: "+soup );
        System.out.println("noodles: "+noodles );
        System.out.println("chicken: "+chicken );

    }
    public void displayMenuCard(){
        System.out.println("Hotal Name Zomoto");
        System.out.println("rice: "+rice );
        System.out.println("mutton: "+mutton );
        System.out.println("soup: "+soup );
        System.out.println("noodles: "+noodles );
        System.out.println("chicken: "+chicken );

    }


}

