package chap5;

import java.util.HashSet;
import java.util.Set;

public class Item30 {

//    public static Set union(Set s1, Set s2) {
//        Set result = new HashSet(s1);
//        result.addAll(s2);
//        return result;
//    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = Set.of("톰", "딕", "해리");
        Set<String> girls = Set.of("헤르미온느", "아리아나");
        Set union = union(guys, girls);
        System.out.println(union);
    }
}
