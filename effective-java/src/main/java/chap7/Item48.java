package chap7;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.stream.LongStream;

public class Item48 {

    public static void main(String[] args) {
        final long number = 50L;

        LocalDateTime piBefore = LocalDateTime.now();
        pi(number);
        LocalDateTime piAfter = LocalDateTime.now();
        System.out.println(piAfter.getNano() - piBefore.getNano());

        LocalDateTime piParallelBefore = LocalDateTime.now();
        piParallel(number);
        LocalDateTime piParallelAfter = LocalDateTime.now();
        System.out.println(piParallelAfter.getNano() - piParallelBefore.getNano());
    }

    private static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    private static long piParallel(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
}
