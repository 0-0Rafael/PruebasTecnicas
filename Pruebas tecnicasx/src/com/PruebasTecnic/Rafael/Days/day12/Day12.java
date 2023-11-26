package com.PruebasTecnic.Rafael.Days.day12;

public class Day12 {
    /*
    * Link for my submit
    * https://leetcode.com/submissions/detail/1106524207/
     */
    public int removeElement(int[] nums, int val) {
        int k=0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
