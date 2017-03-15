package org.adamduffy.codility.java.lesson02arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Correctness tests
 ▶ simple1
 simple test n=5 ✔OK
 1. 0.042 s OK
 ▶ simple2
 simple test n=11 ✔OK
 1. 0.030 s OK
 ▶ extreme_single_item
 [42] ✔OK
 1. 0.047 s OK
 ▶ small1
 small random test n=201 ✔OK
 1. 0.031 s OK
 ▶ small2
 small random test n=601 ✔OK
 1. 0.145 s OK
 expand allPerformance tests
 ▶ medium1
 medium random test n=2,001 ✔OK
 ▶ medium2
 medium random test n=100,003 ✔OK
 ▶ big1
 big random test n=999,999, multiple repetitions ✔OK
 ▶ big2
 big random test n=999,999 ✔OK
 */
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
}
