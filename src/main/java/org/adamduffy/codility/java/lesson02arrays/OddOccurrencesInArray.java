package org.adamduffy.codility.java.lesson02arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] A) {
        int result = 0;
        for (int offset = 0; offset < A.length; offset++) {
            result ^= A[offset];
        }
        return result;
    }
}
