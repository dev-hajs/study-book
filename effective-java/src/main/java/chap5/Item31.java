package chap5;

import java.util.ArrayList;
import java.util.List;

public class Item31 {

    /**
     * 비한정적 타입 매개변수 사용한 메소드
     * @param list
     * @param i
     * @param j
     * @param <E>
     */
    static <E> void swap1(List<E> list, int i, int j) {
        System.out.println("swap1");
        list.set(i, list.set(j, list.get(i)));
    }

    /**
     * 비한정적 와일드카드 사용한 메소드
     * @param list
     * @param i
     * @param j
     */
    static void swap2(List<?> list, int i, int j) {
        System.out.println("swap2");
//        list.set(i, list.set(j, list.get(i)));
        swapHelper(list, i, j);
    }

    /**
     * private 도우미 메소드
     * 와일드카드 타입의 실제 타입을 알려주는 메소드 역할을 한다
     * @param list
     * @param i
     * @param j
     * @param <E>
     */
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        swap1(numList, 0, 1);
        System.out.println(numList);

        swap2(numList, 0, 1);
        System.out.println(numList);
    }
}
