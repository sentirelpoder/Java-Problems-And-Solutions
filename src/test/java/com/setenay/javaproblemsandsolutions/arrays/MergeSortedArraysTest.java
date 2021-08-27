package com.setenay.javaproblemsandsolutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    int[] arr1;
    int[] arr2;

    @Test
    void testMergeEmptyArrays() {
        this.arr1 = new int[]{};
        this.arr2 = new int[]{};
        assertAll(() -> assertArrayEquals(new int[]{}, MergeSortedArrays.mergeSortedArrays(arr1, arr2)),
                () -> assertArrayEquals(new int[]{}, MergeSortedArrays.mergeSortedArrays(arr2, arr1)));
    }

    @Test
    void testMergeWithEmptyArray() {
        this.arr1 = new int[]{1, 2, 5, 7, 9};
        this.arr2 = new int[]{};
        assertArrayEquals(new int[]{1, 2, 5, 7, 9}, MergeSortedArrays.mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArrays() {
        this.arr1 = new int[]{5, 7, 9, 10, 11, 12};
        this.arr2 = new int[]{1, 2, 3, 4, 6, 8};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                MergeSortedArrays.mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArraysWithDuplicated() {
        this.arr1 = new int[]{3, 5, 7, 9, 10, 11, 12};
        this.arr2 = new int[]{1, 2, 3, 4, 6, 6, 6, 6, 8};
        assertArrayEquals(new int[]{1, 2, 3, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10, 11, 12},
                MergeSortedArrays.mergeSortedArrays(arr1, arr2));
    }

}