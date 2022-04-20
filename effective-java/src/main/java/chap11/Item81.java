package chap11;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Item81 {

    private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

    /**
     * before refactoring
     */
    public static String intern(String s) {
        String previousValue = map.putIfAbsent(s, s);
        return previousValue == null ? s : previousValue;
    }

    public static void main(String[] args) {
        String str = "super";
        String internStr = Item81.intern(str);
        System.out.println("str: " + str);
        System.out.println("internStr: " + internStr);
        System.out.println("str == internStr: " + (str == internStr));
        System.out.println("str.equals(internStr): " + (str.equals(internStr)));
    }
}
