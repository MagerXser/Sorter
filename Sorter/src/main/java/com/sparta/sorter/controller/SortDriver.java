package com.sparta.sorter.controller;

import com.sparta.sorter.model.Bubblesort;
import com.sparta.sorter.model.Quicksort;
import com.sparta.sorter.model.RandomArray;
import com.sparta.sorter.model.Sorter;

import java.util.*;

public class SortDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        RandomArray Ra = new RandomArray();

        System.out.println("Type: " + "\n" + "1 for Bubblesort" + "\n" + "2 for Quicksort"  + "\n"
                + "3 for Bubblesort ArrayList" + "\n" +  "4 for QuickSort ArrayList");

        int input = in.nextInt();
        if (input == 1) {

            System.out.println("Bubblesort chosen");
            int[] randomArray = Ra.randomArray(10);
            System.out.println(Arrays.toString(randomArray));
            Sorter bubblesort = new Bubblesort();
            long startTime = System.nanoTime();
            bubblesort.sort(randomArray);
            long endTime = System.nanoTime();
            System.out.println(Arrays.toString(randomArray) + "\n BubbleSort Array runtime: " + (endTime - startTime));

        }else if (input == 2) {

            System.out.println();
            Quicksort qs = new Quicksort();
            int [] randomArray = Ra.randomArray(10);
            System.out.println(Arrays.toString(randomArray));
            long startTime = System.nanoTime();
            qs.sort(randomArray);
            long endTime = System.nanoTime();
            System.out.println(Arrays.toString(randomArray) + "\n QuickSort Array runtime: " + (endTime - startTime));

        }else if (input == 3) {

            ArrayList<Integer> randomArrayList = Ra.randomArrayList(10);
            Sorter bs = new Bubblesort();
            System.out.println(randomArrayList);
            long startTime = System.nanoTime();
            bs.sort(randomArrayList);
            long endTime = System.nanoTime();
            System.out.println(randomArrayList + "\n BubbleSort ArrayList runtime: " + (endTime - startTime));

        }else if (input == 4) {
            ArrayList<Integer> randomArrayList = Ra.randomArrayList(10);
            Sorter qs = new Quicksort();
            System.out.println(randomArrayList);
            long startTime = System.nanoTime();
            qs.sort(randomArrayList);
            long endTime = System.nanoTime();
            System.out.println(randomArrayList + "\n QuickSort ArrayList runtime: " + (endTime - startTime));

        }
    }

}
