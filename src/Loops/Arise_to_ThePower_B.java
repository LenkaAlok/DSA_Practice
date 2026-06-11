package Loops;

import java.util.Scanner;

public class Arise_to_ThePower_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for a:");
        int a=sc.nextInt();
        System.out.println("Enter the number for a to the power :");
        int b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println(a+" raise to the power " +b+" is : "+pow);
    }
}
