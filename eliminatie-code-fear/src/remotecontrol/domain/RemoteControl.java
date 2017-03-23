package remotecontrol.domain;

/**
 * Created by M60095A on 29-8-2016.
 */
public class RemoteControl {

    private static RemoteControl remoteControl = new RemoteControl();

    private static Device activeDevice;

    private RemoteControl() {
    }

    public static RemoteControl setDevice(Device device) {
       activeDevice = device;
        return remoteControl;
    }

    public void turnOn() {
        activeDevice.turnOn();
    }

    public void turmOff() {
        activeDevice.turnOff();
    }
}
