package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode1456 {
    public static void main(String[] args) {
        System.out.println(new Solution1456().maxVowels("leetcode",3));
    }

    static class Solution1456 {
        public int maxVowels(String s, int k) {
            int max = 0;
            int res =0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i-k>=0){
                    char out = chars[i-k];
                    if ('a' == out || 'e' == out || 'i' == out || 'o' == out || 'u' == out) {
                        res--;
                    }
                }
                char in = chars[i];
                if ('a'== in || 'e'== in || 'i'== in || 'o'== in || 'u' == in){
                    res++;
                }
                max = Math.max(max,res);
            }
            return max;
        }
    }
}
