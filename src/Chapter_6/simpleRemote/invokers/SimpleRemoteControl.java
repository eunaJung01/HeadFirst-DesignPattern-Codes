package Chapter_6.simpleRemote.invokers;

import Chapter_6.simpleRemote.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
