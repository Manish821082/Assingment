/* Write a program that takes an integer input n and stores the first n terms
 of the Fibonacci sequence in an array. Then, print the array. For example,
 if the user enters 7, store and display the first 7 terms of the Fibonacci
 sequence: 0, 1, 1, 2, 3, 5, 8. */

import java.util.*;

public class Pr5_Fabonacci {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any length of Fibonacci series");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
