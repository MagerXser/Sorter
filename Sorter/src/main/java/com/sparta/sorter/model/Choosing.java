package com.sparta.sorter.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Choosing {

    RandomArray Ra = new RandomArray();
    Quicksort qs = new Quicksort();
    Sorter bs = new Bubblesort();
    BinaryTreeSort bts = new BinaryTreeSort();

    public void BubbleArrayChosen() {

        System.out.println("Bubblesort chosen");
        int[] randomArray = Ra.randomArray(100);
        System.out.println(Arrays.toString(randomArray));
        long startTime = System.nanoTime();
        bs.sort(randomArray);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(randomArray) + "\n BubbleSort Array runtime: " + (endTime - startTime));
    }

    public void QuickSortArrayChosen() {

        System.out.println();
        int [] randomArray = Ra.randomArray(100);
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

    public void BinaryTreeSort () {
        int [] randomArray = Ra.randomArray(5);
        System.out.println(Arrays.toString(randomArray));
        long startTime = System.nanoTime();
        bts.root = bts.insertLevelOrder(randomArray, bts.root, 0);
        bts.inOrder(bts.root);
        long endTime = System.nanoTime();
        System.out.println("\n Binary Tree Sort runtime: " + (endTime - startTime));
    }
}
