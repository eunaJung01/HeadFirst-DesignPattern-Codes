package Chapter_6.remote.commands;

import Chapter_6.remote.receivers.Light;

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
