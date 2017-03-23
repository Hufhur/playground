package subjects;

import observers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M60095A on 5-9-2016.
 */
public class CoffeeAttendent {

    private List<Customer> customers = new ArrayList<>();
    private Customer helpedCustomer;
    private String completedDrink;

    public void takeOrder(Customer waitingCustomer){
        customers.add(waitingCustomer);

        System.out.println("New customer..." + waitingCustomer + ". People in queue: " + customers.size());
    }

    public void prepareDrink(String drinkToPrepare){
        System.out.println("Making a " + drinkToPrepare + "...");

        boolean found = false;

        for(int x = 0; x < customers.size(); x++){
            if(customers.get(x).getOrderedDrink().equals(drinkToPrepare)){
                found = true;
                this.helpedCustomer = customers.get(x);
                this.completedDrink = drinkToPrepare;
                customers.remove(this.helpedCustomer);
                break;
            }
        }

        if(found)
          callOutCompletedOrder();

    }

    public void callOutCompletedOrder(){
        this.helpedCustomer.orderReady(this.completedDrink);

        System.out.println("One customer helped. People in queue: " + customers.size());
    }


}
