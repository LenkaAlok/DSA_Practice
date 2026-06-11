package Recursion;

import java.util.Scanner;

public class PrintNto_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        System.out.println();
        printDec(n);
    }
    public  static void printDec(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        //recursive work
        printDec(n-1);

    }
}
