package com.jpmc.midascore;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] mainArray = { { 21, 7, 8, 9, 2, 11 }, { 4, 5, 6, 7, 8, 98 } };
        int[][] OpArray = { { 1, 2, 4, 9 },{2,3,4,3}}; 
        int op = 0 ;   
        int fromVal = 0 ; // Start index
        int toVal = 0;   // End index
        int val = 0;     // Value to operate with

        for (int[] subarr : mainArray) {
            System.out.println("Before operation: " + Arrays.toString(subarr));

            for (int i=0;i<OpArray.length; i++) {
                
                op = OpArray[i][0];   
                fromVal = OpArray[i][1]; // Start index
                toVal = OpArray[i][2];   // End index
                val = OpArray[i][3];     // Value to operate with
                }
                
           

            // Check for valid index range
            if (fromVal < 0 || toVal >= subarr.length) {
                System.out.println("Error: Invalid index range.");
                continue;
            }

            switch (op) {
                case 1: // Addition
                    for (int i = fromVal; i <= toVal; i++) {
                        subarr[i] += val;
                    }
                    break;
                case 2: // Subtraction
                    for (int i = fromVal; i <= toVal; i++) {
                        subarr[i] -= val;
                    }
                    break;
                case 3: // Multiplication
                    for (int i = fromVal; i <= toVal; i++) {
                        subarr[i] *= val;
                    }
                    break;
                case 4: // Division (Avoid division by zero)
                    if (val == 0) {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    for (int i = fromVal; i <= toVal; i++) {
                        subarr[i] /= val;
                    }
                    break;
                default:
                    System.out.println("Invalid operation code.");
                    break;
            }

            System.out.println("After operation: " + Arrays.toString(subarr));
        }
    }
}
