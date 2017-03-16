package org.adamduffy.codility.java.lesson03timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int left = A[0];
        int right = 0;
        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }
        int lowest = Math.abs(left - right);
        for (int i = 1; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            if (Math.abs(left - right) < lowest) {
                lowest = Math.abs(left - right);
            }
        }
        return lowest;
    }
}
