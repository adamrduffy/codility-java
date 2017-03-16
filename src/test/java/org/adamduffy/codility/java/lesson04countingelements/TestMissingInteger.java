package org.adamduffy.codility.java.lesson04countingelements;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

public class TestMissingInteger {
    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void example() {
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void extreme_single() {
        assertEquals(1, missingInteger.solution(new int[]{3}));
    }

    @Test
    public void extreme_min_max_int() {
        assertEquals(1, missingInteger.solution(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    public void positive_only() {
        int[] array = join(generateArray(0, 100), generateArray(102, 200));
        shuffleArray(array);
        assertEquals(101, missingInteger.solution(array));
    }

    @Test
    public void negative_only() {
        int[] array = generateArray(-100, -1);
        shuffleArray(array);
        assertEquals(1, missingInteger.solution(array));
    }

    private static int[] join(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    private static int[] generateArray(int min, int max) {
        int[] array = new int[(max - min) + 1];
        for (int i = 0, value = min; i < array.length; i++, value++) {
            array[i] = value;
        }
        return array;
    }

    private static void shuffleArray(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
