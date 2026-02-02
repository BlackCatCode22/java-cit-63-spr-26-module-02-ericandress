// FunWithMethods cit-63 project
//Jan/29/2026
//Es

import java.util.Scanner;

public class FunWithMethods {

    // Method 1: Get an integer from the user
    public static int getAnIntFromTheUser(Scanner sc) {
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }

    // Method 2: Compare two integers
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    // Method 3: Sum two integers
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get two integers from the user
        int num1 = getAnIntFromTheUser(sc);
        int num2 = getAnIntFromTheUser(sc);

        // Compare the numbers
        compareTwoInts(num1, num2);

        // The sum numbers
        int sum = sumTwoInts(num1, num2);
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
