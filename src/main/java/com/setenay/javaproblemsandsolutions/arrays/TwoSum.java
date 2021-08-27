package com.setenay.javaproblemsandsolutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private TwoSum() {
        throw new IllegalStateException("Utility class");
    }

    //Time: O(n^2)
    //Space: O(1)
    public static int[] twoSumOne(int[] nums, int target){
        int[] result = new int[2];
        boolean found = false;

        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if(nums[i]+nums[j] == target && i!=j) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return result;
    }


    //Time: O(n)
    //Space O(n)
    public static int[] twoSumTwo(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> visitedMap = new HashMap<>();

        int complement;
        for(int i = 0; i<nums.length; i++) {
            complement = target-nums[i];
            if(visitedMap.containsKey(complement)) {
                result[0] = visitedMap.get(complement);
                result[1] = i;
                break;
            }
            visitedMap.put(nums[i], i);
        }
        return result;
    }
}
