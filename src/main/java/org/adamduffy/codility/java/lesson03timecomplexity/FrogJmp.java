package org.adamduffy.codility.java.lesson03timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumps = (Y - X) / D;
        return (Y - X) % D > 0 ? jumps + 1 : jumps;
    }
}
