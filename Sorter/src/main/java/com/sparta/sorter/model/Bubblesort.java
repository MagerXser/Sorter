package com.sparta.sorter.model;

import java.util.ArrayList;
import java.util.List;

public class Bubblesort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        boolean changeFound = true;
        while (changeFound) {
            changeFound = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tempA = array[i];
                    int tempB = array[i + 1];
                    array[i] = tempB;
                    array[i + 1] = tempA;
                    changeFound = true;
                }
            }
        }
        return array;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

        boolean changeFound = true;

        while (changeFound) {
            changeFound = false;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) > (arrayList.get(i + 1))) {
                    int temp;
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    changeFound = true;
                }
            }
        }
        return arrayList;
    }


}
