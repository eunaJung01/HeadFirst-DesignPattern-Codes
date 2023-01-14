package Chapter_9.composite_pattern.menu.menus;

// 모든 구성 요소는 MenuComponent 인터페이스를 구현해야만 함
public abstract class MenuComponent {

    // MenuComponent 추가, 제거, 가져오기
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // MenuItem에서 작업을 처리하는 메서드들
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // 출력
    public void print() {
        throw new UnsupportedOperationException();
    }

}
