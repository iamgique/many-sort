package com.iamgique.manysort;

import com.iamgique.manysort.bubblesort.BubbleSort;
import com.iamgique.manysort.bubblesort.BubbleSortInt;
import com.iamgique.manysort.bubblesort.BubbleSortString;
import com.iamgique.manysort.insertionSort.InsertionSort;
import com.iamgique.manysort.insertionSort.InsertionSortInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String... args) {
        BubbleSort bubbleInt = new BubbleSortInt(Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7));
        BubbleSort bubbleSortString = new BubbleSortString(Arrays.asList("z", "b", "y", "q", "a"));
        BubbleSort bubbleSortStringThai = new BubbleSortString(Arrays.asList("ฮ", "ข", "ฑ", "ก", "ฬ", "เ"));
        InsertionSort insertionSortInt = new InsertionSortInt(Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7));

        /*System.out.println("BubbleSort Int");
        System.out.println("Output: " + bubbleInt.bubble());
        System.out.println("BubbleSort String");
        System.out.println("Output: " + bubbleSortString.bubble());
        System.out.println("BubbleSort Thai language");
        System.out.println("Output: " + bubbleSortStringThai.bubble());

        System.out.println("InsertionSort Int");
        System.out.println("Output: " + insertionSortInt.insertion());*/

        a();
        fibonacci();
        System.err.println(fibonacci(10, 0, 0, 1));
    }

    public static void fibonacci() {
        Integer loop = 10;
        Integer resp = 0;
        Integer start = 0;
        Integer next = 1;

        for(int i = 0; i < loop; i++){
            resp = start + next;
            start = next;
            next = resp;
        }
        System.err.println(resp);
    }

    public static int fibonacci(Integer loop, Integer resp, Integer start, Integer next){
        while(loop > 0){
            resp = start + next;
            start = next;
            next = resp;
            fibonacci(--loop, resp, start, next);
        }
        return resp;
    }

    public static void a() {
        List<Integer> list = Arrays.asList(5, 45, 3, 1, 50, 9, 11, 7);

        for (int i = 1; i < list.size(); i++) {
            Integer temp = list.get(i);
            Integer j = i - 1;

            while (j >= 0 && temp < list.get(j)) {
                Collections.swap(list, j, j + 1);
                j -= 1;
            }
        }

        System.err.println(list);
    }
}
