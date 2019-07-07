package com.iamgique.manysort;

import com.iamgique.manysort.bubblesort.BubbleSort;
import com.iamgique.manysort.bubblesort.BubbleSortInt;
import com.iamgique.manysort.bubblesort.BubbleSortString;
import com.iamgique.manysort.insertionSort.InsertionSort;
import com.iamgique.manysort.insertionSort.InsertionSortInt;

import java.util.Arrays;

public class Main {
    public static void main(String... args){
        BubbleSort bubbleInt = new BubbleSortInt(Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7));
        BubbleSort bubbleSortString = new BubbleSortString(Arrays.asList("z", "b", "y", "q", "a"));
        BubbleSort bubbleSortStringThai = new BubbleSortString(Arrays.asList("ฮ", "ข", "ฑ", "ก", "ฬ", "เ"));
        InsertionSort insertionSortInt = new InsertionSortInt(Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7));

        System.out.println("BubbleSort Int");
        System.out.println("Output: " + bubbleInt.bubble());
        System.out.println("BubbleSort String");
        System.out.println("Output: " + bubbleSortString.bubble());
        System.out.println("BubbleSort Thai language");
        System.out.println("Output: " + bubbleSortStringThai.bubble());

        System.out.println("InsertionSort Int");
        System.out.println("Output: " + insertionSortInt.insertion());

    }
}
