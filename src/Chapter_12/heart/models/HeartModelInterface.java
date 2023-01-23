package Chapter_12.heart.models;

import Chapter_12.heart.observers.BPMObserver;
import Chapter_12.heart.observers.BeatObserver;

public interface HeartModelInterface {

    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

}
