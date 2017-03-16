package org.adamduffy.codility.java.lesson02arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] A) {
        int result = 0;
        for (int intInArray : A) {
            result ^= intInArray;
        }
        return result;
    }
}
