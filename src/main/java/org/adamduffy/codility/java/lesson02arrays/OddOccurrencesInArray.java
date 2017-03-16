package org.adamduffy.codility.java.lesson02arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = 0;
        for (int intInArray : A) {
            result ^= intInArray;
        }
        return result;
    }
}
