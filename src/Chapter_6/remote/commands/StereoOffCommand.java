package Chapter_6.remote.commands;

import Chapter_6.remote.receivers.Stereo;

public class StereoOffCommand implements Command {

	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

}
