/**
 * Created by M60095A on 22-9-2016.
 */
public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory  = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.startEngine();

        vehicle = vehicleFactory.getVehicle((VehicleType.TRUCK));
        vehicle.startEngine();
    }
}
