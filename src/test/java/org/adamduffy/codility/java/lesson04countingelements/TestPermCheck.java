package org.adamduffy.codility.java.lesson04countingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPermCheck {
    private PermCheck permCheck = new PermCheck();

    @Test
    public void example() {
        assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }

    @Test
    public void empty() {
        assertEquals(1, permCheck.solution(new int[]{}));
    }

    @Test
    public void anti_sum_1() {
        assertEquals(0, permCheck.solution(new int[]{2, 2, 2, 4}));
    }
}
