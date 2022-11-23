package oops.ood.swiggy.v2;

import java.util.List;

public class
Bill {
    private List<MenuItem> selectedMenuItems;

    public Bill(List<MenuItem> selectedMenuItems) {
        this.selectedMenuItems = selectedMenuItems;
    }

    public void displayBill(){
        System.out.println("Bill Details");
        double total=0;
        for(MenuItem menuItem : selectedMenuItems){
            menuItem.displayItem();
            total= total+menuItem.getPrice();
        }
        System.out.println("Total bill: "+ total);

    }
}
