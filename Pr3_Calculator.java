/*Build a menu-driven calculator that performs addition, subtraction,
 multiplication, or division based on the user's choice. Use if-else
 statements to determine the operation. 
Keep prompting the user to perform another operation until they choose
 to exit */

import java.util.Scanner;

public class Pr3_Calculator {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println(
                    " 1. for Addition\n 2. for Substraction\n 3. Multiplicaton\n 4.Division \n 5. for exit\n Enter Your Choice ");
            ch = sc.nextInt();
            if (ch == 5) {
                System.out.println("Try next Time ");
                break;
            }

            System.out.println("Enter First Number ");
            int N1 = sc.nextInt();
            System.out.println("Enter second Number");
            int N2 = sc.nextInt();

            if (ch == 1) {
                System.out.println(N1 + "+" + N2 + " = " + (N1 + N2));
            } else if (ch == 2) {
                System.out.println(N1 + "-" + N2 + " = " + (N1 - N2));
            } else if (ch == 3) {
                System.out.println(N1 + "*" + N2 + " = " + (N1 * N2));
            } else if (ch == 4) {
                if (N2 == 0) {
                    System.out.println("Error Divison by Zero");
                } else {
                    System.out.println(N1 + "/" + N2 + " = " + (N1 / N2));
                }
            } else {
                System.out.println("\n Invalid choice");
            }
        } while (ch != 5);
    }

}
