package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a Number");
        int n=sc.nextInt();
        if(n<0)n=-n;
    int reverse=0;
    while(n>0){
        reverse=reverse*10;
        reverse=reverse+(n%10);
        n=n/10;
    }
        System.out.println(reverse);
    }
}
