package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode643 {
    public static void main(String[] args) {
        int[] nums = {11};
        int k = 4;
        System.out.println(new Solution643().findMaxAverage(nums,k));
    }

     static class Solution643 {
        public double findMaxAverage(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                res += nums[i];
                if (i+1-k > 0) {
                    res -= nums[i-k];
                }
                if (i+1 >= k) {
                    max = Math.max(max,res);
                }
            }
            return max / (double)k;
        }
    }
}
