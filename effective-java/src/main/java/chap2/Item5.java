package chap2;

import java.util.Objects;

/**
 * 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라
 */
public class Item5 {
    public class SpellChecker {
        private final Object dictionary;

        public SpellChecker(Object dictionary) {
          this.dictionary = Objects.requireNonNull(dictionary);
        }

        public boolean isValid(String word) {
          return true;
        }
    }
}
