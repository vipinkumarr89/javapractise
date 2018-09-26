package com.vipin.Arrays;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        SortingArray sortingArray = new SortingArray();
        int array1[] = sortingArray.getIntegers(sortingArray.arrayLength());
        sortingArray.printArray(array1);
        sortingArray.sortArray(array1);
        sortingArray.rsortArray2(array1);
        System.out.println("after this new code to reverse array");
        sortingArray.rsortArray1(array1);
        sortingArray.printMinValue(array1);

    }
}
