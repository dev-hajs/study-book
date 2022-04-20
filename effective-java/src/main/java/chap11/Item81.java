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

    /**
     * after refactoring
     */
    public static String intern2(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null) {
                result = s;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "super";

        System.out.println("intern = " + intern);
        System.out.println("* ========== *");

        String internStr = Item81.intern(str);
        System.out.println("str: " + str);
        System.out.println("internStr: " + internStr);
        System.out.println("str == internStr: " + (str == internStr));
        System.out.println("str.equals(internStr): " + (str.equals(internStr)));

        System.out.println("* ========== *");

        String internStr2 = Item81.intern2(str);
        System.out.println("str: " + str);
        System.out.println("internStr2: " + internStr2);
        System.out.println("str == internStr2: " + (str == internStr2));
        System.out.println("str.equals(internStr2): " + (str.equals(internStr2)));
    }
}
