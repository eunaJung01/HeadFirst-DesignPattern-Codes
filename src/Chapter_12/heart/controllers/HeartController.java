package Chapter_12.heart.controllers;

import Chapter_12.heart.models.HeartModelInterface;
import Chapter_12.heart.views.HeartView;

public class HeartController implements ControllerInterface {

    HeartModelInterface model;
    HeartView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new HeartView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void increaseBPM() {
    }

    @Override
    public void decreaseBPM() {
    }

    @Override
    public void setBPM(int bpm) {
    }

}
