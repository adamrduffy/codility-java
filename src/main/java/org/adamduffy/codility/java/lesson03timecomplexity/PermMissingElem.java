package org.adamduffy.codility.java.lesson03timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        int sum = 0;
        int fib = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            fib += i + 1;
        }
        return (fib + A.length + 1) - sum;
    }
}
