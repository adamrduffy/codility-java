package org.adamduffy.codility.java.lesson02arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCyclicRotation {
    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void example() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1));
        assertArrayEquals(new int[]{7, 6, 3, 8, 9}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 2));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{8, 9, 7, 6, 3}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 4));
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 5));
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 6));
    }

    @Test
    public void left_shift() {
        assertArrayEquals(new int[]{8, 9, 7, 6, 3}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -1));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -2));
        assertArrayEquals(new int[]{7, 6, 3, 8, 9}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -3));
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -4));
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -5));
        assertArrayEquals(new int[]{8, 9, 7, 6, 3}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, -6));
    }

    @Test
    public void extreme_empty() {
        assertArrayEquals(new int[]{}, cyclicRotation.solution(new int[]{}, 5));
    }

    @Test
    public void single() {
        for (int k = 0; k <= 5; k++) {
            assertArrayEquals(new int[]{3}, cyclicRotation.solution(new int[]{3}, k));
        }
    }

    @Test
    public void double_test() {
        assertArrayEquals(new int[]{3, 4}, cyclicRotation.solution(new int[]{3, 4}, 0));
        assertArrayEquals(new int[]{4, 3}, cyclicRotation.solution(new int[]{3, 4}, 1));
        assertArrayEquals(new int[]{3, 4}, cyclicRotation.solution(new int[]{3, 4}, 2));
    }

    @Test
    public void small_1() {
        assertArrayEquals(new int[]{7, 6, 3, 8, 9}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 2));
    }

    @Test
    public void small_2() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 6));
    }
}
