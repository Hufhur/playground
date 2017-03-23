package remotecontrol.domain;

import remotecontrol.domain.Device;

/**
 * Created by M60095A on 29-8-2016.
 */
public class TV extends Device {



    @Override
    public void turnOn() {
        if (this.isOn()) {
            System.out.println("remotecontrol.domain.TV is already on");
        }
        else {
            System.out.println("remotecontrol.domain.TV is now ON");
            this.switchState();
        }



    }


    @Override
    public void turnOff() {
        if (this.isOn()) {
            System.out.println("remotecontrol.domain.TV is now OFF");
            this.switchState();
        }
        else {
            System.out.println("remotecontrol.domain.TV is already off");
        }


    }

}