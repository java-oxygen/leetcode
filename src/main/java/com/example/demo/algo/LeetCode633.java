package com.example.demo.algo;

public class LeetCode633 {
    public static void main(String[] args) {
        System.out.println(new Solution633().judgeSquareSum(2147483600));
    }

    static class Solution633 {
        public boolean judgeSquareSum(int c) {
            long left = 0;
            long right = (long) Math.sqrt(c);
            while (left <= right) {
                long sum = left * left + right * right;
                if (sum == c) {
                    return true;
                } else if (sum < c) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;
        }
    }
}
