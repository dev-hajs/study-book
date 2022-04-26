package chap12;

public class Item90 {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}

interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("hello world");
    }
}

class Proxy implements Subject {
    Subject subject;

    @Override
    public void request() {
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
    }
}