package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABCEE";
        System.out.println(new Solution76().minWindow(s, t));
    }

    static class Solution76 {
        public String minWindow(String s, String t) {
            int min = Integer.MAX_VALUE;
            int resLeft = 0;
            int resRight = -1;
            int[] counter = new int[128];
            char[] tChars = t.toCharArray();
            for (char tChar : tChars) {
                counter[tChar]++;
            }
            char[] chars = s.toCharArray();
            int tL = t.length();
            int left = 0;
            for (int i = 0; i < chars.length; i++) {
                counter[chars[i]]--;
                if (i >= tL - 1 && isCover(counter)) {
                    while (counter[chars[left]] < 0) {
                        counter[chars[left]]++;
                        left++;
                    }
                    if (min > i - left + 1) {
                        resLeft = left;
                        resRight = i;
                        min = i - left + 1;
                    }
                }
            }
            return s.substring(resLeft, resRight+1);
        }

        boolean isCover(int[] counter) {
            for (int ct : counter) {
                if (ct > 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
