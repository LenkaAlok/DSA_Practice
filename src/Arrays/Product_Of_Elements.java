package Arrays;

import java.util.Scanner;

public class Product_Of_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();   // user gives size

        int arr[] = new int[n]; // create array with user size

        System.out.print("Enter elements:");
      int product=1;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // take elements
        }
        System.out.println("product of Array Element is: ");
        for(int i = 0; i < n; i++) {
           product=product*arr[i];
               // take elements
            }
         System.out.println(product);
        }

    }

