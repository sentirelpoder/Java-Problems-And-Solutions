package com.setenay.javaproblemsandsolutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    //Example 1 in question
    @Test
    void testWithOddTarget() {
        int[] nums = {2, 7, 11, 15};
        int[] solution = {0, 1};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, 9)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, 9)));
    }

    //Example 2 in question
    @Test
    void testWithEvenTargetWithArrayContainsHalfOnce() {
        int[] nums = {3, 2, 4};
        int[] solution = {1, 2};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, 6)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, 6)));
    }

    //Example 3 in question
    @Test
    void testWithEvenTargetWithArrayContainsHalfTwiceConcurrently() {
        int[] nums = {3, 3};
        int[] solution = {0, 1};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, 6)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, 6)));
    }

    @Test
    void testWithEvenTargetWithArrayContainsHalfTwiceNonConcurrently() {
        int[] nums = {3, 5, 2, 3, 6};
        int[] solution = {0, 3};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, 6)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, 6)));
    }

    @Test
    void testWithNegativeArray() {
        int[] nums = {-2, -7, -11, -15};
        int[] solution = {1, 2};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, -18)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, -18)));
    }

    @Test
    void testWithNegativeAndPositiveArray() {
        int[] nums = {-3, 2, 4, -10, 7};
        int[] solution = {1, 3};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, -8)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, -8)));
    }

    @Test
    void testWithZeroTargetAndNegativeAndPositiveArray() {
        int[] nums = {-3, 2, -4, 5, -7, -2, 9};
        int[] solution = {1, 5};
        assertAll(() -> assertArrayEquals(solution, TwoSum.twoSumOne(nums, 0)),
                () -> assertArrayEquals(solution, TwoSum.twoSumTwo(nums, 0)));
    }

    /*
     * No need for test empty array, no solution or multiple solutions
     * because there is exactly one solution according to the problem
     */


}
