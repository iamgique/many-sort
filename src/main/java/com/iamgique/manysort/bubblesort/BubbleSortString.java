package com.iamgique.manysort.bubblesort;

import java.util.Collections;
import java.util.List;

public class BubbleSortString implements BubbleSort{
    private List<String> list;

    public BubbleSortString(List<String> list){
        this.list = list;
    }

    public List bubble() {
        System.out.println("Input:" + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).charAt(0) > list.get(j + 1).charAt(0)) {
                    Collections.swap(list, j, j + 1);
                }
                System.out.println(list);
            }
        }
        return list;
    }
}
