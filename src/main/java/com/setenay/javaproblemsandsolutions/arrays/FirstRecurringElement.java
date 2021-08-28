package com.setenay.javaproblemsandsolutions.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringElement {

    private FirstRecurringElement(){}

    //Time: O(n^2)
    //Space: O(1)
    public static Integer firstRecurringElementOne(int[] nums){
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<nums.length; i++){
            for(int j=i+1; j< nums.length;j++){
                if(nums[i] == nums[j] && j<minIndex)
                    minIndex = j;
            }
        }
        if(minIndex < Integer.MAX_VALUE) return nums[minIndex];
        return null;
    }

    //Time: O(n)
    //Space: O(n)
    public static Integer firstRecurringElementTwo(int[] nums) {
        if (nums.length > 0) {
            Set<Integer> visited = new HashSet<>();
            for (int num : nums) {
                if (visited.contains(num)) return num;
                else
                    visited.add(num);
            }
        }
        return null;
    }
}
