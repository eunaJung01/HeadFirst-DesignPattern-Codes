package Chapter_6.undo.commands;

import Chapter_6.undo.receivers.CeilingFan;

public class CeilingFanLowCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed; // 선풍기의 이전 속도 저장
  
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH:
				ceilingFan.high();
				break;

			case CeilingFan.MEDIUM:
				ceilingFan.medium();
				break;

			case CeilingFan.LOW:
				ceilingFan.low();
				break;

			case CeilingFan.OFF:
				ceilingFan.off();
				break;
		}
	}

}
