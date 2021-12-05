package com.sparta.sorter.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class RandomArray<T extends Comparable<? super T>> {

        public T[] randomArray(int arraylength) {

            Integer A = 10;
            final Class<?> data = A.getClass();
            T[] randomArray = (T[]) Array.newInstance(data, arraylength);
            Random r = new Random();
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = (T) (Integer) r.nextInt(1000);
            }
            return randomArray;
        }


        public ArrayList<Integer> randomArrayList(int size) {

            ArrayList<Integer> al = new ArrayList<>();
            int pick;
            Random rand = new Random();

            for (int i = 0; i < size; i++) {
                pick = rand.nextInt(1000);
                al.add(pick);
            }
            return al;
        }


//    public int [] randomArray(int arraylength){
//
//        int[] randomArray = new int [arraylength];
//        Random r = new Random();
//        for (int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = r.nextInt(1000);
//        }
//        return randomArray;
//    }
//
//    public ArrayList<Integer> randomArrayList (int size) {
//
//        ArrayList<Integer> al = new ArrayList<>();
//        int pick;
//        Random rand = new Random();
//
//        for (int i = 0; i<size; i++)
//        {
//            pick = rand.nextInt(1000);
//            al.add(pick);
//        }
//        return al;
//    }

}
