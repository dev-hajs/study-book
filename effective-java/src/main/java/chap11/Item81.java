package chap11;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

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

    public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);

        for (int i=0; i<concurrency; i++) {
            executor.execute(() -> {
                // 타이머에게 준비를 마쳤음을 알린다.
                ready.countDown();

                try {
                    // 모든 작업자 스레드가 준비될 때까지 기다린다.
                    start.wait();
                    action.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    // 타이머에게 작업을 마쳤음을 알린다.
                    done.countDown();
                }
            });
        }

        ready.await(); // 모든 작업자가 준비될 때 까지 기다린다.
        long startNanos = System.nanoTime();
        start.countDown(); // 작업자들을 깨운다.
        done.await(); // 모든 작업자가 일을 끝마치기를 기다린다.

        return System.nanoTime() - startNanos;
    }

    public static void main(String[] args) {
        String str = "super";

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
