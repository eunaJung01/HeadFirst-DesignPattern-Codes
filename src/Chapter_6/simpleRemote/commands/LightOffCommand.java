package Chapter_6.simpleRemote.commands;

import Chapter_6.simpleRemote.receivers.Light;

public class LightOffCommand implements Command {

	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
