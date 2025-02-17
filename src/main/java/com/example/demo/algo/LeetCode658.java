package com.example.demo.algo;

import java.util.ArrayList;
import java.util.List;

public class LeetCode658 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int k = 4;
        int x = -1;
        System.out.println(new Solution658().findClosestElements(arr, k, x));
    }

    static class Solution658 {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int left = 0;
            int right = arr.length - 1;
            while (right - left >= k){
                if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
                    left++;
                }else {
                    right--;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
    }
}
