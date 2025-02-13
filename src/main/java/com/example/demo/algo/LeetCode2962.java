package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode2962 {
    public static void main(String[] args) {
        System.out.println();
    }

    static class Solution2962 {
        public long countSubarrays(int[] nums, int k) {
            int left = 0;
            long maxCnt = 0;
            long maxVal = Long.MIN_VALUE;
            long res = 0;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }

            for (int num : nums) {
                if (num == maxVal) {
                    maxCnt++;
                }
                while (maxCnt >= k) {
                    if (nums[left] == maxVal) {
                        maxCnt--;
                    }
                    left++;
                }
                res += left;
            }
            return res;
        }
    }
}
