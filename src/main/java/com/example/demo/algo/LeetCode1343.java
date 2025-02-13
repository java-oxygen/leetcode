package com.example.demo.algo;

/**
 * @author baozx
 **/
public class LeetCode1343 {

    public static void main(String[] args) {
        int[] arr = {};
        int k = 0;
        int threshold = 0;
        System.out.println(new Solution1343().numOfSubarrays(arr,k,threshold));
    }

    static class Solution1343 {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int resCount = 0;
            int subRes= 0;
            for (int i = 0; i < arr.length; i++) {
                subRes += arr[i];
                if (i+1-k > 0){
                    subRes -= arr[i-k];
                }
                if (i+1>=k && subRes>=threshold*k){
                    resCount++;
                }
            }
            return resCount;
        }
    }
}
