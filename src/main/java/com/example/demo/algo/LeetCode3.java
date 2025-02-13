package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }

    static class Solution3 {
        public int lengthOfLongestSubstring(String s) {
            char[] chars = s.toCharArray();
            int[] existArr = new int[128];
            int left = 0;
            int max = 0;
            for (int i = 0; i < chars.length; i++) {
                existArr[chars[i]]++;
                while (existArr[chars[i]]>1) {
                    existArr[chars[left]]--;
                    left++;
                }
                max = Math.max(max,i-left+1);
            }
            return max;
        }
    }
}
