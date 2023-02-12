import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *************** PROBLEM ******************
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * ******************************************
 */

class Solution1 {
    public static boolean majorityElement(int[] a) {
        int n = a.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                    //swap elements
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }

            }
        }
        for(int i=0; i<n-1; i++){
            if(a[i] == a[i+1])
                return true;

        }
        return false;
    }
}

public class Example2 {
    public static void main(String[] args) {
        int a[] ={2,30,3,4,5,6,7};

        boolean result = Solution1.majorityElement(a);
        if (result) System.out.println("Array contains duplicates !!");
        else System.out.println("Array does not contains duplicate.");
    }

}
