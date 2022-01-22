package chap4;

import java.util.Collection;
import java.util.Set;

/**
 * 래퍼 클래스 - 상속 대신 컴포지션을 사용
 * 다른 Set 에 계측 기능을 덧씌운다는 뜻에서 Decorator Pattern 이라고도 한다.
 * @param <E>
 */
public class Item18InstrumentedSet<E> extends Item18ForwardingSet<E> {
    private int addCount = 0;

    public Item18InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
