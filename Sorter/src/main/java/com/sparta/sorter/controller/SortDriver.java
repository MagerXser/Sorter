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

        System.out.println("Type 1 for Bubblesort, 2 for Quicksort, 3 for Bubblesort List function: ");

        int input = in.nextInt();
        if (input == 1) {

            System.out.println("Bubblesort chosen");
            int[] randomArray = Ra.randomArray(10);
            System.out.println(Arrays.toString(randomArray));
            Sorter bubblesort = new Bubblesort();
            long startTime = System.nanoTime();
            bubblesort.sort(randomArray);
            long endTime = System.nanoTime();
            System.out.println(Arrays.toString(randomArray) + "\n Bubble Sort runtime: " +  + (endTime - startTime));

        }else if (input == 2) {

            System.out.println();
            Quicksort qs = new Quicksort();
            int [] randomArray = Ra.randomArray(10);
            System.out.println(Arrays.toString(randomArray));
            long startTime = System.nanoTime();
            qs.sort(randomArray);
            long endTime = System.nanoTime();
            System.out.println(Arrays.toString(randomArray));
            System.out.println("Bubble Sort runtime: " + (endTime - startTime));

        }else if (input == 3) {

            ArrayList<Integer> randomArrayList = Ra.randomArrayList(10);
//            ArrayList<Integer> al = new ArrayList<>();
//            Bubblesort bs = new Bubblesort();
            Sorter bs = new Bubblesort();
//            Random rand = new Random();
//
//            int pick;
//
//            for (int j = 0; j<10; j++)
//            {
//                pick = rand.nextInt(100);
//                al.add(pick);
//            }
//            Collections.shuffle(randomArrayList);
            System.out.println(randomArrayList);
            long startTime = System.nanoTime();
            bs.sort(randomArrayList);
            long endTime = System.nanoTime();
            System.out.println(randomArrayList);
            System.out.println("Bubble Sort runtime: " + (endTime - startTime));

        }else if (input == 4) {

        }
    }
    public static int[] randomIntegerArray() {
        int[] size = new int[10];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size.length; i++) {
            size[i] = random.nextInt(100);
        }
        return size;
    }

}
