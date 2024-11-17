/* 1. Write a Java program that takes an integer input from the user and
 calculates the factorial of the number. Then, write a method to calculate
 the sum of the digits of this factorial. For example, if the user enters 5,
 calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3). */

import java.util.Scanner;

class Pr1_Factorial {
    static int sumOfdigit(int Fact) {
        int sum = 0, rem;
        while (Fact > 0) {
            rem = Fact % 10;
            sum = sum + rem;
            Fact = Fact / 10;
        }
        return sum;

    }

    public static void main(String arg[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int Num = Sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= Num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial =" + fact);
        System.out.println("Sum of Digit of" + fact + " = " + sumOfdigit(fact));
    }

}