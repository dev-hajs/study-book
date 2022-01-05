public class Item4 {

    // 기본 생성자가 만들어지는 것을 막는다. (인스턴스화 방지용)
    private Item4() {
        throw new AssertionError();
    }
}
