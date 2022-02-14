package chap6;

import java.util.EnumSet;
import java.util.Set;

public class Item36 {

    public static void main(String[] args) {
        System.out.println("=== Text ===");
        Text.applyStyles(Text.STYLE_BOLD);
        Text.applyStyles(Text.STYLE_ITALIC);

        System.out.println("=== TextEnumSet ===");
        TextEnumSet.applyStyles(EnumSet.of(TextEnumSet.Style.BOLD, TextEnumSet.Style.ITALIC));
    }

    /**
     * 비트 필드를 가진 열거 타입
     */
    static class Text {
        static final int STYLE_BOLD          = 1 << 0; // 1
        static final int STYLE_ITALIC        = 1 << 1; // 2
        static final int STYLE_UNDERLINE     = 1 << 2; // 4
        static final int STYLE_STRIKETHROUGH = 1 << 3; // 8

        static void applyStyles(int styles) {
            System.out.println(styles);
        }
    }

    /**
     * EnumSet 을 반영한 열거 타입
     */
    static class TextEnumSet {
        public enum Style {
            BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
        }

        // 모든 클라이언트에서 EnumSet 을 건네리라 짐작되는 상황이라도
        // 이왕이면 인터페이스로 받는 게 일반적으로 좋은 습관이다.
        static void applyStyles(Set<Style> styles) {
            System.out.println(styles);
        }
    }
}
