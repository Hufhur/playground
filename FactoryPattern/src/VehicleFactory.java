/**
 * Created by M60095A on 22-9-2016.
 */
public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType){
        return vehicleType.getVehicle();
    }
}
