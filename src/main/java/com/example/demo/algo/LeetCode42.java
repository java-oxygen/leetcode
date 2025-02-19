package com.example.demo.algo;

public class LeetCode42 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(new Solution42().trap(arr));
    }
    static class Solution42 {
        int m = 0;
        int res = 0;
        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxL = height[left];
            int maxR = height[right];
            int res = 0;
            while (left <= right) {
                if (height[left] < height[right]) {
                    maxL = Math.max(maxL, height[left]);
                    res+=maxL-height[left];
                    left++;
                }else {
                    maxR = Math.max(maxR, height[right]);
                    res+=maxR-height[right];
                    right--;
                }
            }
            return res;
        }
    }
}
