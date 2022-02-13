package chap5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class Item33 {

    public static void main(String[] args) {
        Favorites f = new Favorites();

        // String.class
        f.putFavorite(String.class, "Java");
        String favoriteString = f.getFavorite(String.class);
        System.out.println("favoriteString = " + favoriteString);

        // Integer.class
        f.putFavorite(Integer.class, 1000);
        Integer favoriteInteger = f.getFavorite(Integer.class);
        System.out.println("favoriteInteger = " + favoriteInteger);

        // Class.class
        f.putFavorite(Class.class, Favorites.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.println("favoriteClass = " + favoriteClass.getName());


        // (주의) 타입 안전을 깨뜨리는 방법
//        f.putFavorite((Class)Integer.class, "Integer 의 인스턴스가 아닙니다.");
//        Integer favoriteInteger = f.getFavorite(Integer.class);
//        System.out.println(favoriteInteger);

//        HashSet<Integer> set = new HashSet<>();
//        ((HashSet)set).add("문자열입니다.");
    }

    /**
     * Favorites Class
     */
    static class Favorites {
        private Map<Class<?>, Object> favorites = new HashMap<>();

        public <T> void putFavorite(Class<T> type, T instance) {
            favorites.put(Objects.requireNonNull(type), type.cast(instance));
        }
        public <T> T getFavorite(Class<T> type) {
            return type.cast(favorites.get(type));
        }
    }
}
