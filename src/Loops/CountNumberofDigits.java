package Loops;

import java.util.Scanner;

public class CountNumberofDigits {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a Number");
        int n=sc.nextInt();
        int count=0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Number of digits : " + count);
}
}