package org.adamduffy.codility.java.lesson05prefixsums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        return B / K - A / K + ((A % K) == 0 ? 1 : 0);
    }
}
