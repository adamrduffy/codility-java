package org.adamduffy.codility.java.lesson04countingelements;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        int pop = 0;
        for (int offset : A) {
            if (offset > result.length) {
                pop = max;
            } else {
                if (result[offset - 1] > pop) {
                    result[offset - 1] = result[offset -1] + 1;
                } else {
                    result[offset -1] = pop + 1;
                }
                if (result[offset - 1] > max) {
                    max = result[offset - 1];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] < pop) {
                result[i] = pop;
            }
        }
        return result;
    }
}
