package com.setenay.javaproblemsandsolutions.arrays;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/
public class MaximumSubArray {

    private MaximumSubArray() {
        throw new IllegalStateException("Utility class");
    }

    //O(n^3)
    public static int maxSubArrayOne(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        //i #of elements in sub arrays
        for (int i = 1; i <= nums.length; i++) {
            //j start point of subArray
            for (int j = 0; j < nums.length; j++) {
                int sum = nums[j];
                for (int k = j+1; k < i; k++)
                    sum += nums[k];
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    //O(n^2)
    public static int maxSubArrayTwo(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        Queue<Integer> queue = new LinkedList<>();

        int maxSum = nums[0];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(queue.isEmpty())
                    break;
                sum = nums[i] + queue.poll();
                if (sum > maxSum) maxSum = sum;
                queue.add(sum);
            }
            queue.add(nums[i]);
        }
        while(!queue.isEmpty())
        {
            if(queue.peek() > maxSum) maxSum = queue.peek();
            queue.poll();
        }
        return maxSum;
    }

    public static int maxSubArrayThree(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static int maxSubArrayFour(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return maxSubArrayFour(nums, 0, nums.length - 1);
    }

    private static int maxSubArrayFour(int[] nums, int startIndex, int endIndex) {
        if (startIndex == endIndex) return nums[startIndex];

        int middleIndex = ((startIndex + endIndex) / 2);
        int leftSum = maxSubArrayFour(nums, startIndex, middleIndex);
        int rightSum = maxSubArrayFour(nums, middleIndex + 1, endIndex);
        return Math.max(Math.max(leftSum, rightSum), maxCrossingSum(nums, startIndex, middleIndex, endIndex));
    }

    static int maxCrossingSum(int[] nums, int l, int m,
                              int h) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + nums[i];
            if (sum > leftSum)
                leftSum = sum;
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            sum = sum + nums[i];
            if (sum > rightSum)
                rightSum = sum;
        }

        return Math.max(leftSum + rightSum,
                Math.max(leftSum, rightSum));
    }

}