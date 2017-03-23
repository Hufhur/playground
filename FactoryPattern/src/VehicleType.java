/**
 * Created by M60095A on 22-9-2016.
 */
public enum VehicleType {

    CAR, TRUCK;

    public Vehicle getVehicle() {
        switch (this) {
            case CAR: return new Car();
            case TRUCK: return new Truck();
        }

        return null;
    }


}
