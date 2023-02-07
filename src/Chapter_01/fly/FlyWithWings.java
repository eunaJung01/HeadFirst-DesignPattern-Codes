package Chapter_01.fly;

// 실제로 날 수 있는 오리들의 나는 행동을 구현한 클래스
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }

}
