package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode1004 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(new Solution1004().longestOnes(nums, k));
    }

    static class Solution1004 {
        public int longestOnes(int[] nums, int k) {
            int maxL = 0;
            int left = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    k--;
                }
                while (k < 0) {
                    if (nums[left] == 0) {
                        left++;
                        k++;
                        break;
                    }
                    left++;
                }
                maxL = Math.max(maxL, i - left + 1);
            }
            return maxL;
        }
    }
}
