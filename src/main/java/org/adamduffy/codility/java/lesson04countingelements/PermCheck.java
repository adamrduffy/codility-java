package org.adamduffy.codility.java.lesson04countingelements;

public class PermCheck {
    public int solution(int[] A) {
        int[] other = new int[A.length];
        for (int value : A) {
            if (value - 1 >= A.length || other[value - 1] == value) {
                return 0;
            }
            other[value - 1] = value;
        }
        return 1;
    }
}
