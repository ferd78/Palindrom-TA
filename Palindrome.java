package Week5;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        boolean con = true;
        Scanner det = new Scanner(System.in);
        System.out.println("Palindrome Program: \n 1. Palindrome Checker \n 2. Quit \n Choose: ");
        int opt = det.nextInt();
        while (con) {
            if (opt == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string to be checked: ");
                String input_string = sc.next();
                String Reverse = "";
                Stack palindrome_stack = new Stack();

                for (int i = 0; i < input_string.length(); i++) {
                    palindrome_stack.push(input_string.charAt(i));
                }

                while (!palindrome_stack.isEmpty()) {
                    Reverse += palindrome_stack.pop();
                }


                if (input_string.equals(Reverse)) {
                    System.out.println("The string " + "{" + input_string + "}" + " is a palindrome.");
                }

                else {
                    System.out.println("The string " + "{" + input_string + "}" + " is not a palindrome.");
                    con = false;
                }
            }
            else if (opt == 2) {
                System.out.println("Goodbye!");
                con = false;
            }
        }
    }
}
