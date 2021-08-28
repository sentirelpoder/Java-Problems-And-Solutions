package com.setenay.javaproblemsandsolutions.arrays;

import org.junit.jupiter.api.Test;

import static com.setenay.javaproblemsandsolutions.arrays.FirstRecurringElement.*;
import static org.junit.jupiter.api.Assertions.*;

class FirstRecurringElementTest {

    @Test
    void emptyArray() {
        int[] nums = {};
        assertAll(() ->  assertNull(firstRecurringElementOne(nums)),
                () ->  assertNull(firstRecurringElementTwo(nums)));
    }

    @Test
    void uniqueElements() {
        int[] nums = {2, 3, 4, 5};
        assertAll(() ->  assertNull(firstRecurringElementOne(nums)),
                () ->  assertNull(firstRecurringElementTwo(nums)));
    }

    @Test
    void recurringElementsCaseOne() {
        int[] nums = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        assertAll(() ->  assertEquals(2,firstRecurringElementOne(nums)),
                () -> assertEquals(2,firstRecurringElementTwo(nums)));
    }

    @Test
    void recurringElementsCaseTwo() {
        int[] nums = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        assertAll(() ->  assertEquals(1,firstRecurringElementOne(nums)),
                () -> assertEquals(1,firstRecurringElementTwo(nums)));
    }
}