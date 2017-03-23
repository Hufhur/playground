package remotecontrol.domain;

/**
 * Created by M60095A on 29-8-2016.
 */
public abstract class Device {

    private Boolean isOn = false;

    public abstract void turnOn();
    public abstract void turnOff();

    public boolean isOn() {
        return isOn;
    }

    public void switchState() {
        isOn = !isOn;
    }
}
