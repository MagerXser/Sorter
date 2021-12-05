package com.sparta.sorter.model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class BinaryTreeSort <T extends Comparable<? super T>> {

    Node root;
    RandomArray Ra = new RandomArray();

    // Tree Node
    class Node {
        T data;
        Node left, right;
        Node(T data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insertLevel (Node root, T nodeValue) {
        if (root == null) {
            root = new Node (nodeValue);
            return root;
        }
        if (nodeValue.compareTo(root.data) < 0) {
            root.left = insertLevel(root.left, nodeValue);
        }else if (nodeValue.compareTo(root.data) > 0) {
            root.right = insertLevel(root.right, nodeValue);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void order (Node root, T[] array) {
        Stack<Node> stack = new Stack<>();
        int nextFreeSpace = 0;
        while (!stack.isEmpty() || root != null) {
            if (root != null){
                stack.push(root);
                root = root.left;
            }else {
                Node temp = stack.pop();
                array[nextFreeSpace] = temp.data;
                root = temp.right;
                nextFreeSpace++;
            }
        }
    }

    public void BinaryTreeSort () {
        BinaryTreeSort bts = new BinaryTreeSort();

        T[] randomArray = (T[]) Ra.randomArray(100);
//        randomArray[0] = randomArray [1];
        System.out.println(Arrays.toString(randomArray));
        long startTime = System.nanoTime();
        for (int i = 0; i < randomArray.length; i++)
        {
            bts.insert(randomArray[i]);
        }
        Integer A = 10;
        final Class<?> data = A.getClass();
        T[] newArray = (T[]) Array.newInstance(data,randomArray.length);
        bts.order(bts.root, newArray);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(newArray));
        System.out.println("\n Binary Tree Sort runtime: " + (endTime - startTime));
    }

    public void insert (T nodeValue) {
        root = insertLevel(root, nodeValue);
    }
}