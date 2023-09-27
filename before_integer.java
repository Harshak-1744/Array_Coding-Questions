/* Problem: Find Numbers Before X

Write a Java program that takes an integer array and a target number X as input. The program should find and print all the numbers in the array that appear before the first occurrence of X in the array.

For example, if the input array is [5, 2, 9, 3, 7, 6] and X is 3, the program should output [5, 2, 9] because these are the numbers that appear before the first occurrence of 3 in the array.

You can solve this problem by iterating through the array and keeping track of the numbers you encounter until you find the target number X. Once you find X, 
stop iterating and print the numbers you encountered before it   */

// Program 
import java.util.Arrays;
import java.util.Scanner;

public class NumbersBeforeX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target number X
        System.out.print("Enter the target number X: ");
        int X = scanner.nextInt();

        // Find the index of X in the array
        int indexOfX = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                indexOfX = i;
                break; // Stop searching once X is found
            }
        }

        if (indexOfX != -1) {
            // Extract and print the numbers before X
            int[] numbersBeforeX = Arrays.copyOfRange(array, 0, indexOfX);
            System.out.println("Numbers before " + X + ": " + Arrays.toString(numbersBeforeX));
        } else {
            System.out.println(X + " not found in the array.");
        }

        scanner.close();
    }
}
