//Cit 63 largestofthree.java project
//Feb/01/2026
//ES

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
    // for user input
        Scanner sc = new Scanner(System.in);
    // Print the statement for the user
        System.out.print("Enter 3 integers: ");
        // gets the three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;

        if (a > b) {
            if (a > c) largest = a;
            else largest = c;
        } else {
            if (b > c) largest = b;
            else largest = c;
        }
    // gives you the output
        System.out.println("Largest: " + largest);
        sc.close();
    }
}