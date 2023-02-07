package Chapter_06.party;

import Chapter_06.party.commands.*;
import Chapter_06.party.invokers.RemoteControl;
import Chapter_06.party.receivers.Hottub;
import Chapter_06.party.receivers.Light;
import Chapter_06.party.receivers.TV;
import Chapter_06.party.receivers.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        // ON Commands
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        // OFF Commands
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, hottubOn}; // ON 커맨드용 배열
        Command[] partyOff = {lightOff, stereoOff, hottubOff}; // OFF 커맨드용 배열

        // 각 배열을 전달하여 매크로 커맨드를 생성
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // 매크로 커맨드를 버튼에 할당
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        // 테스트
        System.out.println(remoteControl);

        System.out.println("\n--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);

        System.out.println("\n--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }

}
