package Chapter_7.adapter_pattern.adapter;

import Chapter_7.adapter_pattern.adapter.ducks.Duck;
import Chapter_7.adapter_pattern.adapter.turkeys.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly(); // 좀 더 멀리 움직이도록 5번 호출
        }
    }

}
