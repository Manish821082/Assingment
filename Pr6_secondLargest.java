
/* 6 . Write a program that accepts n integers from the user (where n is also
 provided by the user). Store the numbers in an array and write a method
 to find and display the second largest number in the array. */
import java.util.*;

public class Pr6_secondLargest {
    static void largest(int arr[], int n) {
        int max = arr[0];
        int secmax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secmax) {
                if (arr[i] < max) {
                    secmax = arr[i];
                }
            }
        }
        if (secmax < max) {
            System.out.println("Second largest number" + secmax);
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to enter ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" Enter the" + n + " Integer number");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest(arr, n);
    }
}
