package chap2;

import java.util.regex.Pattern;

/**
 * 불필요한 객체 생성을 피하라
 * (부제: 생성 비용이 비싼 객체는 최대한 재사용하자)
 */
public class Item6 {

//    public class RomanNumerals {
        private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3}(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

//        static boolean isRomanNumeral(String s) {
//            return s.matches("^(?=.)M*(C[MD]|D?C{0,3}(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//        }

        static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
        }
//    }
}
