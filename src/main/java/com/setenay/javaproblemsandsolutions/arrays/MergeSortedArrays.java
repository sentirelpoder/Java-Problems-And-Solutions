package com.setenay.javaproblemsandsolutions.arrays;

public class MergeSortedArrays {

    private MergeSortedArrays() {
        throw new IllegalStateException("Utility class");
    }

    //O(n+m)
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i >= arr1.length)
                mergedArray[index++] = arr2[j++];
            else if (j >= arr2.length)
                mergedArray[index++] = arr1[i++];
            else if (arr1[i] < arr2[j])
                mergedArray[index++] = arr1[i++];
            else
                mergedArray[index++] = arr2[j++];

        }

        return mergedArray;
    }
}
