//ReversedStrings project for cit-63
//Jan/29/2026
//ES
import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        //result
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}