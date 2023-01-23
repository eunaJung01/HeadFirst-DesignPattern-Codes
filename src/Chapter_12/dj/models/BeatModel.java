package Chapter_12.dj.models;


import Chapter_12.dj.observers.BPMObserver;
import Chapter_12.dj.observers.BeatObserver;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {

    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();

    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    public void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    @Override
    public void initialize() {
        try {
            File resource = new File("clip.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception ex) {
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    public void notifyBPMObservers() {
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM();
        }
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception ignored) {
            }
        }
    }

    public void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.updateBeat();
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

}
