package chap10;

public class Item71 {

    public static void main(String[] args) {
        System.out.println("start");

        action();

        System.out.println("end");
    }

    public static void action() {
        try {

            System.out.println("> try");
            throw new TheCheckedException("bamm!");

        } catch (TheCheckedException e) {

            System.out.println("> catch");
            throw new AssertionError("bamm!");

        }
    }
}
