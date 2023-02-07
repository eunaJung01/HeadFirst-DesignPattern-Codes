package Chapter_02.subjects;

import Chapter_02.observers.Observer;

public interface Subject {

    // 옵저버 등록
    public void registerObserver(Observer observer);

    // 옵저버 탈퇴
    public void removeObserver(Observer observer);

    // 모든 옵저버에게 상태 변화를 알림
    public void notifyObservers();

}
