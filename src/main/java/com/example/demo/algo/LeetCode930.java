package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode930 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1};
        int goal = 3;
        System.out.println(new Solution930().numSubarraysWithSum(nums, goal));
    }

    /**
     * 思路 滑动窗口的f(k)函数返回的是大于等于k的值，那等于k的 就可以用 f(k)-f(k+1)获得
     */
    static class Solution930 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            return f(nums, goal) - f(nums, goal + 1);
        }

        private int f(int[] nums, int k) {
            long sum = 0;
            int res = 0;
            int left = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                while (sum >= k && sum - nums[left] >= k && left < i) {
                    sum -= nums[left];
                    left++;
                }
                if (sum >= k) {
                    res += left + 1;
                }
            }
            return res;
        }
    }
}
