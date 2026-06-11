package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Nuber");
        int n=sc.nextInt();
        for (int i=2;i<=3*n-1;i+=3){
            System.out.print(i+" ");
        }
    }
}
