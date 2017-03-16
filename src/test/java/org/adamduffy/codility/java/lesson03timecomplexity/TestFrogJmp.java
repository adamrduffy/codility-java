package org.adamduffy.codility.java.lesson03timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFrogJmp {
    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void example() {
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }

    @Test
    public void extreme_position() {
        assertEquals(0, frogJmp.solution(10, 10, 30));
    }

    @Test
    public void small_extreme_jump() {
        assertEquals(1, frogJmp.solution(10, 40, 30));
    }
}
