/*Write a program that takes an integer input n and prints an inverted
 triangle of numbers. For example, if n = 5, the output should be
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1 */

import java.util.*;

public class Pr8_Triangle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
