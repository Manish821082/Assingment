/* 2. Create a program that accepts 10 integers from the user, stores them in
 an array, and then prints only the prime numbers in that array.
 Implement a separate method to check if a number is prime. */

import java.util.Scanner;

public class Pr2_PrimeAraay {
    static void prime(int arr[]) {
        int j;
        for (int i = 0; i < 10; i++) {
            for (j = 2; j < arr[i]; j++) {
                if (arr[i] % 2 == 0) {
                    break;
                }
            }
            if (arr[i] == j) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the any 10 Array element ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        prime(arr);
    }

}
