package org.adamduffy.codility.java.lesson01iterations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBinaryGap {
    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void examples() {
        assertEquals(5, binaryGap.solution(1041));
        assertEquals(0, binaryGap.solution(15));
    }

    @Test
    public void extremes() {
        assertEquals(0, binaryGap.solution(1));
        assertEquals(1, binaryGap.solution(5));
        assertEquals(0, binaryGap.solution(2147483647));
    }

    @Test
    public void trailingZeros() {
        assertEquals(0, binaryGap.solution(6));
        assertEquals(2, binaryGap.solution(328));
    }

    @Test
    public void powerOf2() {
        assertEquals(1, binaryGap.solution(5));
        assertEquals(0, binaryGap.solution(16));
        assertEquals(0, binaryGap.solution(1024));
    }

    @Test
    public void simple1() {
        assertEquals(2, binaryGap.solution(9));
        assertEquals(1, binaryGap.solution(11));
    }

    @Test
    public void simple2() {
        assertEquals(2, binaryGap.solution(19));
        assertEquals(1, binaryGap.solution(42));
    }

    @Test
    public void simple3() {
        assertEquals(3, binaryGap.solution(1162));
        assertEquals(1, binaryGap.solution(5));
    }

    @Test
    public void medium1() {
        assertEquals(2, binaryGap.solution(51712));
        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void medium2() {
        assertEquals(3, binaryGap.solution(561892));
        assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void medium3() {
        assertEquals(9, binaryGap.solution(66561));
    }

    @Test
    public void large1() {
        assertEquals(20, binaryGap.solution(6291457));
    }

    @Test
    public void large2() {
        assertEquals(4, binaryGap.solution(74901729));
    }

    @Test
    public void large3() {
        assertEquals(25, binaryGap.solution(805306373));
    }

    @Test
    public void large4() {
        assertEquals(5, binaryGap.solution(1376796946));
    }

    @Test
    public void large5() {
        assertEquals(29, binaryGap.solution(1073741825));
    }

    @Test
    public void large6() {
        assertEquals(28, binaryGap.solution(1610612737));
    }
}
