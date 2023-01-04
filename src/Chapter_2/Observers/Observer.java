package Chapter_2.Observers;

public interface Observer {

    // TODO: Push 방식 : 주제가 옵저버로 데이터를 보냄
    // public void update(float temp, float humidity, float pressure);

    // TODO: Pull 방식 : 옵저버가 주제로부터 데이터를 당겨옴
    public void update();

}
