package Chapter_06.simpleRemote.invokers;

import Chapter_06.simpleRemote.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
