package Chapter_6.undo;

import Chapter_6.undo.commands.CeilingFanOffCommand;
import Chapter_6.undo.commands.CeilingFanHighCommand;
import Chapter_6.undo.commands.CeilingFanMediumCommand;
import Chapter_6.undo.commands.LightOffCommand;
import Chapter_6.undo.commands.LightOnCommand;
import Chapter_6.undo.invokers.RemoteControlWithUndo;
import Chapter_6.undo.receivers.CeilingFan;
import Chapter_6.undo.receivers.Light;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // TODO: 전등
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed(); // 작업 취소

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed(); // 작업 취소


        // TODO: 선풍기
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // Command를 버튼에 할당
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        // 테스트
        remoteControl.onButtonWasPushed(0); // → MEDIUM으로 설정됨
        remoteControl.offButtonWasPushed(0); // → 선풍기 끄기
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed(); // 작업 취소 → MEDIUM으로 되돌아감

        remoteControl.onButtonWasPushed(1); // → HIGH로 설정됨
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed(); // 작업 취소 → MEDIUM으로 되돌아감
    }

}
