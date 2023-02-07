package Chapter_06.undo.commands;

import Chapter_06.undo.receivers.CeilingFan;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed; // 선풍기의 이전 속도 저장

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
