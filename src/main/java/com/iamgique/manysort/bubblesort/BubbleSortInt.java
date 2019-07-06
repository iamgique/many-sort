package com.iamgique.manysort.bubblesort;

import java.util.Collections;
import java.util.List;

public class BubbleSortInt implements BubbleSort {

    public List bubble(List input) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (Integer.parseInt(input.get(j).toString()) > Integer.parseInt(input.get(j + 1).toString())) {
                    Collections.swap(input, j, j + 1);
                }
                //System.out.println(input);
            }
        }
        return input;
    }
}
