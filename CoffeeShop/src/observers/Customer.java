package observers;

/**
 * Created by M60095A on 5-9-2016.
 */
public class Customer implements WaitingCustomer {

    private String name;
    private String orderedDrink;

    public Customer(String name, String orderedDrink) {
        this.name = name;
        this.orderedDrink = orderedDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderedDrink() {
        return orderedDrink;
    }

    public void setOrderedDrink(String orderedDrink) {
        this.orderedDrink = orderedDrink;
    }

    @Override
    public void orderReady(String orderedDrink) {
        System.out.format("I, %s, have my drink, a %s.\n", getName(), orderedDrink);
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", orderedDrink='" + orderedDrink + '\'' +
            '}';
    }
}
