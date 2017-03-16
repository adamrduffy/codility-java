package org.adamduffy.codility.java.lesson02arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        int[] result = new int[A.length];
        int shift = K % A.length;
        if (shift < 0) {
            shift = A.length + shift;
        }

        System.arraycopy(A, 0, result, shift, A.length - shift);
        System.arraycopy(A, A.length - shift, result, 0, shift);
        return result;
    }
}
