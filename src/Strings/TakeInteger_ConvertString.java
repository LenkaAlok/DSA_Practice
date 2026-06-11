package Strings;

import java.util.Scanner;

public class TakeInteger_ConvertString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        String s="";//it is empty  string
        s=s+n;
        System.out.println(s);
        String s2=Integer.toString(n);
        System.out.println(s2);
    }
}
