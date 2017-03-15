package org.adamduffy.codility.java.lesson01iterations;

public class BinaryGap {
    public static void main(String args[]) {
        System.out.println(new BinaryGap().solution(9));
        System.out.println(new BinaryGap().solution(529));
        System.out.println(new BinaryGap().solution(20));
        System.out.println(new BinaryGap().solution(15));
        System.out.println(new BinaryGap().solution(-15));
    }

    public int solution(int N) {
        char[] binaryString = Integer.toBinaryString(N).toCharArray();
        int maxBinaryGap = 0;
        for (int count = 0, position = 0; position < binaryString.length; position++) {
            if (binaryString[position] == '1') {
                if (count > maxBinaryGap) {
                    maxBinaryGap = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return maxBinaryGap;
    }
}
