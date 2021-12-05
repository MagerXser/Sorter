package com.sparta.sorter;

import com.sparta.sorter.model.BinaryTreeSort;
import com.sparta.sorter.model.Choosing;

import java.util.Scanner;

public class Interface {

    Scanner in = new Scanner(System.in);
    Choosing c = new Choosing();
    BinaryTreeSort bts = new BinaryTreeSort();
    boolean go = true;
    boolean run = true;

    public void userInterface () {

        System.out.println("Type: " + "\n" + "1 for Bubblesort" + "\n" + "2 for Quicksort" + "\n"
                + "3 for Bubblesort ArrayList" + "\n" + "4 for QuickSort ArrayList" + "\n" + "5 for Binary Tree Sort"
                + "\n" + "6 to Exit");

        while (go == true){
            while(run) {
                int input = in.nextInt();
                if (input == 1) {
                    c.BubbleArrayChosen();
                    run = false;
                    wait(2000);
                } else if (input == 2) {
                    c.QuickSortArrayChosen();
                    run = false;
                    wait(2000);
                } else if (input == 3) {
                    c.BubbleArrayListChosen();
                    run = false;
                    wait(2000);
                } else if (input == 4) {
                    c.QuicksortArrayListChosen();
                    run = false;
                    wait(2000);
                } else if (input == 5){
                    bts.BinaryTreeSort();
                    run = false;
                    wait(2000);
                }  else if (input == 6) {
                    System.out.println("Goodbye.");
                    go = false;
                    System.exit(0);
                }else {
                    System.out.println("Incorrect Input, please try again");
                    run = true;
                }if (run==false)
                    System.out.println("\n" + "Type: " + "\n" + "1 for Bubblesort" + "\n" + "2 for Quicksort" + "\n"
                            + "3 for Bubblesort ArrayList" + "\n" + "4 for QuickSort ArrayList" + "\n" + "5 for Binary Tree Sort"
                            + "\n" + "6 to Exit");
                if (input == 1 || input == 2 || input == 3 || input == 4) {
                    run = true;
                }
            }
        }

    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
