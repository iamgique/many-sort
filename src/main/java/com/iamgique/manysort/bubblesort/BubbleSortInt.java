package com.iamgique.manysort.bubblesort;

import java.util.Collections;
import java.util.List;

public class BubbleSortInt implements BubbleSort {
    private List list;

    public BubbleSortInt(List list) {
        this.list = list;
    }


    public List bubble() {
        System.out.println("Input:" + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (Integer.parseInt(list.get(j).toString()) > Integer.parseInt(list.get(j + 1).toString())) {
                    Collections.swap(list, j, j + 1);
                }
                //System.out.println(input);
            }
        }
        return list;
    }
}
