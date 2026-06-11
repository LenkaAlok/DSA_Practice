package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a Number");
        int n=sc.nextInt();
        if(n<0)n=-n;
        int sum=0;
        int r;
            while (n !=0) {
                r = n %10;
                sum=sum+r;
                n=n/10;
            }
        System.out.println(sum);
        }
}