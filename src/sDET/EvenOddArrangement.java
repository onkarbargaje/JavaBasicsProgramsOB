package sDET;

import java.util.Scanner;

public class EvenOddArrangement {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Read the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Rearrange the array
        int[] result = rearrangeEvenOdd(array);

        // Print the rearranged array
        System.out.println("Array with even numbers first and odd numbers last:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] rearrangeEvenOdd(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        // Add even numbers to the result array first
        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Add odd numbers to the result array
        for (int num : array) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }

}
