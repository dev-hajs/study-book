package issue;

public interface InterfaceA {

    String printJuso();

    default String printName() {
        System.out.println("printName - Interface");
        return "jisoo";
    }

    default String printFace() {
        return "눈코입";
    }
}
