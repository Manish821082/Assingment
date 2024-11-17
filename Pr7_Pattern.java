/* Write a program that takes an integer input n and prints a pyramid of
 numbers up to n rows, where each row has an increasing count of
 numbers. For example, if n = 4, the output should be
 1
 1 2
 1 2 3
 1 2 3 4 */

import java.util.*;

public class Pr7_Pattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
