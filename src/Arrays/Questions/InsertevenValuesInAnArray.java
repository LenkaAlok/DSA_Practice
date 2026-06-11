package Arrays.Questions;

import java.util.Scanner;

public class InsertevenValuesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                arr[i] = n;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
