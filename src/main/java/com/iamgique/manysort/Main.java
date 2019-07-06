package com.iamgique.manysort;

import com.iamgique.manysort.bubblesort.BubbleSort;
import com.iamgique.manysort.bubblesort.BubbleSortInt;
import com.iamgique.manysort.bubblesort.BubbleSortString;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args){
        List<Integer> examInt = Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7);
        List<String> examString = Arrays.asList("z", "b", "y", "q", "a");
        List<String> examStringThaiLanguage = Arrays.asList("ฮ", "ข", "ฑ", "ก", "ฬ", "เ");
        BubbleSort bubbleSortInt = new BubbleSortInt();
        BubbleSort bubbleSortString = new BubbleSortString();

        System.out.println("BubbleSort Int");
        System.out.println("Input: " + examInt);
        System.out.println("Output: " + bubbleSortInt.bubble(examInt));
        System.out.println("BubbleSort String");
        System.out.println("Input: " + examString);
        System.out.println("Output: " + bubbleSortString.bubble(examString));
        System.out.println("BubbleSort Thai language");
        System.out.println("Input: " + examString);
        System.out.println("Output: " + bubbleSortString.bubble(examStringThaiLanguage));
    }
}
