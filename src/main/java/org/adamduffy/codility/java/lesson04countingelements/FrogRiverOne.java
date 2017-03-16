package org.adamduffy.codility.java.lesson04countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<Integer>();
        for (int second = 0; second < A.length; second++) {
            leaves.add(A[second]);
            if (leaves.size() == X) {
                return second;
            }
        }
        return -1;
    }
}
