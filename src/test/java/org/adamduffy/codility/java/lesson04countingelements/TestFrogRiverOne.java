package org.adamduffy.codility.java.lesson04countingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFrogRiverOne {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void example() {
        assertEquals(6, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void single() {
        assertEquals(0, frogRiverOne.solution(1, new int[]{1}));
    }

    @Test
    public void extreme_frog() {
        assertEquals(-1, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 2, 4}));
    }

    @Test
    public void extreme_leaves() {
        assertEquals(-1, frogRiverOne.solution(5, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
