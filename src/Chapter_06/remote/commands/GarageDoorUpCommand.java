package Chapter_06.remote.commands;

import Chapter_06.remote.receivers.GarageDoor;

public class GarageDoorUpCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

}
