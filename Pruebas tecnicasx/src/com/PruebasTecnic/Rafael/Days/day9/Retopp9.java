package com.PruebasTecnic.Rafael.Days.day9;

public class Retopp9 {

    // * https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {

        int index = nums.length;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] < target && i == index){
                return i + 1;

            }else if(nums[i] == target){

                return i;

            }else if (nums[i] > target){
                return i;
            }

        }

        return index;

    }
}
