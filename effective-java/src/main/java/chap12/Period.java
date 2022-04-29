package chap12;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class Period implements Serializable {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    // proxy
    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        private static final long serialVersionUID = 123123L;

        public SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }
    }

    // 직렬화 프록시 패턴용 writePlace 메서드
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // 직렬화 프록시 패턴용 readObject 메서드
    private void readObject(ObjectInputStream ois) throws IOException {
        throw new InvalidObjectException("Proxy required!");
    }
}
