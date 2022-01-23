package chap4;

public interface Item20Programmer {

    // 추상 메소드
    void printUseLanguage();

    // 정적 메소드
    static void printJob() {
        System.out.println("개발자");
    }

//    default boolean equals(Object o) {
//        System.out.println("equals()");
//        return false;
//    }
//
//    default void hashCode() {
//        System.out.println("hashCode()");
//    }
}
