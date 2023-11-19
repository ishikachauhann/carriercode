p97 : Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s

import java.util.*;

public class array {
   static void print(int arr[], int n){
      System.out.print("Array after segregation is ");
      for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");
	}
	public static void main(String[] args){
       int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
       int n = arr.length;
       Arrays.sort(arr);
       print(arr, n);
   }
}