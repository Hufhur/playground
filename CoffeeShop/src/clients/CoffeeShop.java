package clients;

import observers.Customer;
import subjects.CoffeeAttendent;

/**
 * Created by M60095A on 5-9-2016.
 */
public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();

        coffeeAttendent.takeOrder(new Customer("mike","coffee"));
        coffeeAttendent.takeOrder(new Customer("jan","beer"));
        coffeeAttendent.takeOrder(new Customer("klaas","late"));
        coffeeAttendent.takeOrder(new Customer("piet","esspresso"));
        coffeeAttendent.takeOrder(new Customer("truus","esspresso"));

        coffeeAttendent.prepareDrink("beer");
        coffeeAttendent.prepareDrink("beer");
        coffeeAttendent.prepareDrink("esspresso");
        coffeeAttendent.prepareDrink("esspresso");


    }
}
