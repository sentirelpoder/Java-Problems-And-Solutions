package com.setenay.javaproblemsandsolutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {

    //Example 1 from problem
    @Test
    void maxSubArrayCaseOne() {
        int[] nums = {1};
        int solution = 1;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }


    //Example 2 from problem
    @Test
    void maxSubArrayCaseTwoOneElement() {
        int[] nums = {1};
        int solution = 1;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }

    //Example 3 from problem
    @Test
    void maxSubArrayCaseThree() {
        int[] nums = {5,4,-1,7,8};
        int solution = 23;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }

    @Test
    void maxSubArrayCaseFour() {
        int[] nums = {5,4,-1,7,8,-5};
        int solution = 23;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }

    @Test
    void maxSubArrayCaseOneNegative() {
        int[] nums = {-1};
        int solution = -1;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }

    @Test
    void maxSubArrayCaseOneFullNegative() {
        int[] nums = {-2,-1};
        int solution = -1;
        assertAll(() -> assertEquals(solution, MaximumSubArray.maxSubArrayOne(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayTwo(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayThree(nums)),
                () -> assertEquals(solution, MaximumSubArray.maxSubArrayFour(nums)));
    }

    /*
     * No need for empty nums because of the 1 <= nums.length <= 3 * 104 constraint
     */
}