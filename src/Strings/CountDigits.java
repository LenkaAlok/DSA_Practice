package Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        double d=sc.nextDouble();
//        int count=0;
//        while(n>0){
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);
        String s=""+n;
        System.out.println(s.length());
        String s2=""+d;
        System.out.println(s2.length());

    }
}
