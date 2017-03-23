package manufactory.client;

import manufactory.FactorLaptop;
import manufactory.FactorPhone;

/**
 * Created by M60095A on 29-8-2016.
 */
public class Manager {

    public static void main(String[] args) {

        FactorLaptop factorLaptop = new FactorLaptop("Laptop");
        FactorPhone factorPhone = new FactorPhone("Phone");

        factorLaptop.launchProcess();
        factorPhone.launchProcess();

    }
}
