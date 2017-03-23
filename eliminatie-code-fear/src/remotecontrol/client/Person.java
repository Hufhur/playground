package remotecontrol.client;

import remotecontrol.domain.Projector;
import remotecontrol.domain.RemoteControl;
import remotecontrol.domain.SurroundSoundSystem;
import remotecontrol.domain.TV;

/**
 * Created by M60095A on 29-8-2016.
 */
public class Person {

    public static void main(String[] args) {

        RemoteControl ab = RemoteControl.setDevice(new TV());
        ab.turnOn();
        ab.turmOff();
        ab.turnOn();
        ab.turnOn();
        ab.turmOff();
        ab.turmOff();
        ab.turmOff();

        ab = RemoteControl.setDevice(new Projector());
        ab.turmOff();
        ab.turnOn();

        ab = RemoteControl.setDevice(new SurroundSoundSystem());
        ab.turnOn();
        ab.turmOff();



    }
}
