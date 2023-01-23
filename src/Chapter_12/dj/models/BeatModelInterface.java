package Chapter_12.dj.models;

import Chapter_12.dj.observers.BPMObserver;
import Chapter_12.dj.observers.BeatObserver;

public interface BeatModelInterface {

    // BeatModel 인스턴스 생성
    void initialize();

    // 비트 생성기 전원 조작
    void on();

    void off();

    int getBPM();

    void setBPM(int bpm);

    // Observer 등록/해제
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

}
