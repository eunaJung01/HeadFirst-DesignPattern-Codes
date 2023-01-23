package Chapter_12.dj;

import Chapter_12.dj.controllers.BeatController;
import Chapter_12.dj.controllers.ControllerInterface;
import Chapter_12.dj.models.BeatModel;
import Chapter_12.dj.models.BeatModelInterface;

public class DJTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }

}
