package Chapter_6.party.commands;

import Chapter_6.party.receivers.Light;

public class LightOnCommand implements Command {

    Light light;
    int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off(); // 다시 불을 끔
    }

}