package com.sparta.sorter.model;
import java.util.ArrayList;
import java.util.Random;

public class RandomArray {

    public int [] randomArray(int arraylength){

        int[] randomArray = new int [arraylength];
        Random r = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(100);

            // printed the random array with length 10
        }
        return randomArray;
    }

    public ArrayList<Integer> randomArrayList (Integer arrayListLength) {
        ArrayList<Integer> al = new ArrayList<>(arrayListLength);
        int pick;
        Random rand = new Random();

        for (int i = 0; i<10; i++)
        {
            pick = rand.nextInt(100);
            al.add(pick);
        }
        return al;
    }

}
