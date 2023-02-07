package Chapter_06.party.commands;

import Chapter_06.party.receivers.TV;

public class TVOffCommand implements Command {

	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}
