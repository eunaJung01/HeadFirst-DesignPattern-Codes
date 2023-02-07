package Chapter_06.undo.commands;

import Chapter_06.undo.receivers.Light;

public class LightOffCommand implements Command {

    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on(); // 다시 불을 켬
    }

}
