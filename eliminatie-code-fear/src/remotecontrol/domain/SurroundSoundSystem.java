package remotecontrol.domain;

import remotecontrol.domain.Device;

/**
 * Created by M60095A on 29-8-2016.
 */
public class SurroundSoundSystem extends Device {

    @Override
    public void turnOn() {
        System.out.println("remotecontrol.domain.SurroundSoundSystem is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("remotecontrol.domain.SurroundSoundSystem is now OFF");
    }
}
