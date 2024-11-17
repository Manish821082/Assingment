
/*Take a string input from the user and a character to search for. Write a
 method to count the occurrences of the character in the string and return
 the count. Then display the count to the user. */
import java.util.*;

public class Pr10_Charsearch {
    static void Search(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Total number of character occurrence = " + "  " + count);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String st = sc.next();
        System.out.println("Enter the character you want to be search");
        char ch = sc.next().charAt(0);
        Search(st, ch);

    }

}
