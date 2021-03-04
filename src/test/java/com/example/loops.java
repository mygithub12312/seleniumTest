package com.example;

//largest value
public class loops {
    public static void main(String[] args) {
        int[] arr = {132, 153, 2, 524, 12, 9, 3, 1, 7, 4, 64, 345, 23, 63, 24};
        int val = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }
        }
        System.out.println("The Largest is "+val);
    }
}
