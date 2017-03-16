package org.adamduffy.codility.java.lesson04countingelements;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMaxCounters {
    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void example() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}
