package org.adamduffy.codility.java.lesson04countingelements;

import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> list = new TreeSet<Integer>();
        for (int value : A) {
            list.add(value);
        }
        int min = 1;
        for (int value : list) {
            if (min == value) {
                min++;
            }
        }
        return min;
    }
}
