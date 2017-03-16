package org.adamduffy.codility.java.lesson03timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ▶ double
 two elements ✘WRONG ANSWER
 got 0 expected 2000
 1. 0.110 s WRONG ANSWER,  got 0 expected 2000
 2. 0.078 s OK
 ▶ simple_positive
 simple test with positive numbers, length = 5 ✔OK
 ▶ simple_negative
 simple test with negative numbers, length = 5 ✔OK
 ▶ small_random
 random small, length = 100 ✔OK
 ▶ small_range
 range sequence, length = ~1,000 ✔OK
 ▶ small
 small elements ✘WRONG ANSWER
 got 0 expected 20
 1. 0.059 s WRONG ANSWER,  got 0 expected 20
 */
public class TestTapeEquilibrium {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void example() {
        assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void two_elements() {
        assertEquals(2000, tapeEquilibrium.solution(new int[]{-1000, 1000}));
    }
}
