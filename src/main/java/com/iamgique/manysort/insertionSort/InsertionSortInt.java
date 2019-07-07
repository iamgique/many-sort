package com.iamgique.manysort.insertionSort;

import java.util.Collections;
import java.util.List;

public class InsertionSortInt implements InsertionSort {

    private List list;

    public InsertionSortInt(List list) {
        this.list = list;
        System.out.println("Input:" + list);
    }

    public List insertion() {
        System.out.println("Input:" + list);
        for (int i = 1; i < list.size(); i++) {
            Integer temp = Integer.parseInt(list.get(i).toString());
            Integer j = i - 1;
            while (j >= 0 && Integer.parseInt(list.get(j).toString()) > temp) {
                Collections.swap(list, j, j + 1);
                j-=1;
            }
        }
        return list;
    }

}
