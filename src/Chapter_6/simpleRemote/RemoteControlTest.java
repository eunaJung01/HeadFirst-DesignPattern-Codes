package Chapter_6.simpleRemote;

import Chapter_6.simpleRemote.commands.GarageDoorOpenCommand;
import Chapter_6.simpleRemote.commands.LightOnCommand;
import Chapter_6.simpleRemote.invokers.SimpleRemoteControl;
import Chapter_6.simpleRemote.receivers.GarageDoor;
import Chapter_6.simpleRemote.receivers.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Receiver
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Command (Command에 Receiver를 전달)
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        /*
         * Invoker에 작업을 요청
         * 1. Invoker에 Command 객체를 전달
         * 2. 행동 메소드 execute() 호출
         */
        // light
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        // garage
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
