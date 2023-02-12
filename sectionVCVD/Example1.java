/**
 * *************** PROBLEM **********************************
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * *********************************************************
 */
class Solution {
    public static int majorityElement(int[] a) {
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
        return a[a.length/2];
    }
}
public class Example1 {

    public static void main(String[] args) {
        int a[] ={2,30,2,12,2,2,2,2};

        System.out.println("Before Bubble Sort");
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        int result = Solution.majorityElement(a);

        System.out.println("\nAfter Bubble Sort");
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nThe most repeating element in array is "+result);
    }

}
