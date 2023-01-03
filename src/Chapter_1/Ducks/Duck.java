package Chapter_1.Ducks;

import Chapter_1.Fly.FlyBehavior;
import Chapter_1.Quack.QuackBehavior;

public abstract class Duck {

    // TODO: 행동 인터페이스 형식의 레퍼런스 변수 선언
    // 같은 패키지에 속하는 모든 서브 클래스에서 이 변수를 상속
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    // TODO: 행동 클래스에 위임
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
