/* 4. Accept a string input from the user and check if it’s a palindrome (a word
 that reads the same forwards and backwards). Create a method to
 reverse the string and compare it to the original to determine if it’s a
 palindrome */

import java.util.*;

public class Pr4_Palindrome {
    static void pallindrom(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);

        }
        System.out.println(rev);
        if (word.equals(rev)) {
            System.out.println("Word is Pallindrom");

        } else {
            System.out.println("Word is not pallindrom");
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Word");
        String str = sc.next();
        
        pallindrom(str);

    }
}
