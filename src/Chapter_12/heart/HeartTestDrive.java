package Chapter_12.heart;

import Chapter_12.heart.controllers.ControllerInterface;
import Chapter_12.heart.controllers.HeartController;
import Chapter_12.heart.models.HeartModel;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }

}
