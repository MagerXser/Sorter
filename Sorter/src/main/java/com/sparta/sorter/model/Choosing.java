package com.sparta.sorter.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Choosing<T extends Comparable<? super T>> {

    RandomArray Ra = new RandomArray();
    Quicksort qs = new Quicksort();
    Sorter bs = new Bubblesort();
    BinaryTreeSort bts = new BinaryTreeSort();

    public void BubbleArrayChosen() {

        System.out.println("Bubblesort chosen");
        T[] randomArray = (T[]) Ra.randomArray(100);
        System.out.println(Arrays.toString(randomArray));
        long startTime = System.nanoTime();
        bs.sort(randomArray);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(randomArray) + "\n BubbleSort Array runtime: " + (endTime - startTime));
    }

    public void QuickSortArrayChosen() {

        System.out.println();
        T[] randomArray = (T[]) Ra.randomArray(100);
        System.out.println(Arrays.toString(randomArray));
        long startTime = System.nanoTime();
        qs.sort(randomArray);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(randomArray) + "\n QuickSort Array runtime: " + (endTime - startTime));

    }

    public void BubbleArrayListChosen () {
        ArrayList<Integer> randomArrayList = Ra.randomArrayList(100);
        System.out.println(randomArrayList);
        long startTime = System.nanoTime();
        bs.sort(randomArrayList);
        long endTime = System.nanoTime();
        System.out.println(randomArrayList + "\n BubbleSort ArrayList runtime: " + (endTime - startTime));
    }

    public void QuicksortArrayListChosen () {
        ArrayList<Integer> randomArrayList = Ra.randomArrayList(100);
        System.out.println(randomArrayList);
        long startTime = System.nanoTime();
        qs.sort(randomArrayList);
        long endTime = System.nanoTime();
        System.out.println(randomArrayList + "\n QuickSort ArrayList runtime: " + (endTime - startTime));
    }
}
