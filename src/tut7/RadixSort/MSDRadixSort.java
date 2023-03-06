package tut7.RadixSort;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Arrays;

// WARNING: This code has some bugs, I will try to fix it later...

/**
 * TBH, I do not recommend coding MSD like this.
 * I got this code from a github project but it was not 
 * functional. I spent a good 10 minutes trying to fix 
 * it and rewrite it in a better way. I should have spent 
 * that time writing the code instead ahah.
 */


/** 
 * MSD Radix Sort. Stable, in-place. Sorts starting with the
 * most significant digit, putting each digit into buckets progessively.
 * O(nlgn) worst-case, O(n) best-case, O(nlgn) average.
 */

public class MSDRadixSort {

    /** Sort ARRAY using MSD Radix Sort. */
    public static void radixSort(int[] array) {
        int digits = maxDigit(array);
        for (int i = digits; i > 0; i--) {
            sortDigit(array, i);
        }
    }

    /** Returns the maximum number of digits in any one integer in ARRAY. */
    public static int maxDigit(int[] array) {
        int max = 0;
        for (int i : array) {
            String number = Integer.toString(i);
            if (number.length() > max) {
                max = number.length();
            }
        }
        return max;
    }

    /** Sort ARRAY by digit N. */
    private static void sortDigit(int[] array, int n) {
        HashMap<Integer, ArrayDeque<Integer>> bins =
        new HashMap<Integer, ArrayDeque<Integer>>();

        for (int i = 0; i <= 9; i++) {
            bins.put(i, new ArrayDeque<Integer>());
        }

        for (int i : array) {
            int num = (i/(10*n)) % 10;
            bins.get(num).add(i);
        }
        int index = 0;

        for (int k = 0; k <= 9; k++) {
            ArrayDeque<Integer> bin = bins.get(k);
            while (!bin.isEmpty()) {
                array[index] = bin.remove();
                index += 1;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={36, 99, 54, 83, 23, 67, 89, 54, 0};
         
        System.out.println("List of items from array before sorting: "+ Arrays.toString(arr));
      
        radixSort(arr);
        System.out.println("List of items from array after sorting: "+ Arrays.toString(arr));
 
    }

}

