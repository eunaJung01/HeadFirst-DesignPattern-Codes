package Chapter_06.undo.invokers;

import Chapter_06.undo.commands.Command;
import Chapter_06.undo.commands.NoCommand;

public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;

    // UNDO 버튼을 눌렀을 때를 대비해서 마지막으로 사용한 커맨드의 레퍼런스를 저장하는 변수
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot]; // 해당 객체의 레퍼런스를 undoCommand 인스턴스 변수에 저장
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot]; // 해당 객체의 레퍼런스를 undoCommand 인스턴스 변수에 저장
    }

    // 마지막으로 했던 작업을 취소
    public void undoButtonWasPushed() {
        undoCommand.undo(); // undoCommand에 저장된 Command 객체의 undo() 메서드를 호출
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "\t\t\t" + offCommands[i].getClass().getName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuilder.toString();
    }

}
