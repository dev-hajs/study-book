package chap10;

public class Item71 {


    public static void main(String[] args) {
        System.out.println("start");

        try {
            System.out.println("try");
            throw new TheCheckedException("bamm!");
        } catch (TheCheckedException e) {
            throw new AssertionError();
        } finally {
            System.out.println("end");
        }

    }
}
