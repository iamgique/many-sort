package com.iamgique.manysort.bubblesort;

import java.util.Collections;
import java.util.List;

public class BubbleSortString implements BubbleSort{

    public List bubble(List input) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j).toString().charAt(0) > input.get(j + 1).toString().charAt(0)) {
                    Collections.swap(input, j, j + 1);
                }
                //System.out.println(input);
            }
        }
        return input;
    }
}
