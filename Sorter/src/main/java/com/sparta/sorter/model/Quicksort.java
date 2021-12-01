package com.sparta.sorter.model;

import java.util.ArrayList;
import java.util.Random;

public class Quicksort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        else if (array.length <= 1){
            return array;
        }else {
            return quickSort(array, 0, array.length-1);
        }
    }

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){
        if (arrayList == null) return null;
        else if (arrayList.size() <= 1){
            return arrayList;
        }else {
            return quickSortArrayList(arrayList, 0, arrayList.size()-1);
        }
    }

    public int[] quickSort (int[] A, int low, int high){
        if (low < high +1 ) {
            int p = partition (A, low, high);
            quickSort(A,low, p-1);
            quickSort(A, p+1, high);
        }
        return A;
    }
    public void swap (int [] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    public int getPivot (int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1)+ low;
    }

    public int partition (int[] A, int low, int high){
        swap (A, low, getPivot(low,high));
        int border = low +1;
        for (int i = border; i <=high; i++) {
            if (A[i] < A [low]){
                swap(A,i,border++);
            }
        }
        swap(A, low, border -1);
        return border -1;
    }

    public ArrayList<Integer> quickSortArrayList (ArrayList<Integer> A, int low, int high){
        if (low < high +1 ) {
            int p = partitionArrayList (A, low, high);
            quickSortArrayList(A,low, p-1);
            quickSortArrayList(A, p+1, high);
        }
        return A;
    }

    public int partitionArrayList (ArrayList<Integer> A, int low, int high){
        swapArrayList (A, low, getPivot(low,high));
        int border = low +1;
        for (int i = border; i <=high; i++) {
            if (A.get(i) < A.get(low)){
                swapArrayList(A,i,border++);
            }
        }
        swapArrayList(A, low, border -1);
        return border -1;
    }

    public void swapArrayList (ArrayList<Integer> A, int index1, int index2) {
        int temp = A.get(index1);
        A.set(index1, A.get(index2));
        A.set(index2, temp);
    }
}
