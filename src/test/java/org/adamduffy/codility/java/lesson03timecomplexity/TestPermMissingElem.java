package org.adamduffy.codility.java.lesson03timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPermMissingElem {
    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void example() {
        assertEquals(4, permMissingElem.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void empty_and_single() {
        assertEquals(1, permMissingElem.solution(new int[]{}));
        assertEquals(1, permMissingElem.solution(new int[]{2}));
    }

    @Test
    public void missing_first_or_last() {
        assertEquals(1, permMissingElem.solution(new int[]{2, 3, 5, 4}));
        assertEquals(5, permMissingElem.solution(new int[]{2, 3, 1, 4}));
    }

    @Test
    public void single_element() {
        assertEquals(1, permMissingElem.solution(new int[]{2}));
    }

    @Test
    public void double_elements() {
        assertEquals(2, permMissingElem.solution(new int[]{1, 3}));
    }
}
