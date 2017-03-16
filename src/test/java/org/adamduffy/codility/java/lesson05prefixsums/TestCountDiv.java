package org.adamduffy.codility.java.lesson05prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCountDiv {
    private CountDiv countDiv = new CountDiv();

    @Test
    public void example() {
        assertEquals(3, countDiv.solution(6, 11, 2));
    }

    @Test
    public void simple() {
        assertEquals(20, countDiv.solution(11, 345, 17));
    }

    @Test
    public void minimal() {
        assertEquals(0, countDiv.solution(0, 0, 11));
    }

    @Test
    public void extreme_if_empty() {
        assertEquals(1, countDiv.solution(10, 10, 5));
        assertEquals(0, countDiv.solution(10, 10, 7));
        assertEquals(0, countDiv.solution(10, 10, 20));
    }

    @Test
    public void extreme() {
        assertEquals(181818181, countDiv.solution(0, 2000000000, 11));
        assertEquals(1, countDiv.solution(0, 2000000000, 2000000000));
    }

    @Test
    public void empty() {
        assertEquals(0, countDiv.solution(3, 10, 11));
    }
}
