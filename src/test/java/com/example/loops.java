package com.example;

//largest value
public class loops {
    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 6, 12, 9, 3, 1, 7, 4, 10, 5, 8, 4, 0};
        int val = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }
        }
        System.out.println("The Largest is "+val);
    }
}
