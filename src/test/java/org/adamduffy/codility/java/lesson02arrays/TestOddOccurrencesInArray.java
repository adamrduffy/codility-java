package org.adamduffy.codility.java.lesson02arrays;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOddOccurrencesInArray {
    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void example() {
        assertEquals(7, oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void extreme_single_item() {
        assertEquals(42, oddOccurrencesInArray.solution(new int[]{42}));
    }

    @Test
    public void small_1() {
        assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(201)));
    }

    @Test
    public void small_2() {
        assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(601)));
    }

    @Test
    public void medium_1() {
        assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(2001)));
    }

    @Test
    public void medium_2() {
        assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(100003)));
    }

    @Test
    public void big_1() {
        for (int i = 0; i < 10; i++) {
            assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(999999)));
        }
    }

    @Test
    public void big_2() {
        assertNotEquals(0, oddOccurrencesInArray.solution(generateOddShuffledArray(999999)));
    }

    private static int[] generateOddShuffledArray(int n) {
        int[] oddArray = generateOddArray(0, 1000000000, n);
        shuffleArray(oddArray);
        return oddArray;
    }

    private static int[] generateOddArray(int min, int max, int n) {
        Random rnd = ThreadLocalRandom.current();
        int[] array = new int[n];
        for (int position = 0; position < n; position += 2) {
            int randomNum = rnd.nextInt((max - min) + 1) + min;
            array[position] = randomNum;
            if (position + 1 < n) {
                array[position + 1] = randomNum;
            }
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
