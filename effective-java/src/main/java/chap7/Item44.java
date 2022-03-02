package chap7;

import java.util.function.Predicate;

public class Item44 {

    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test("하지수")); // true
        System.out.println(isEmpty.test("")); // false
    }

}
