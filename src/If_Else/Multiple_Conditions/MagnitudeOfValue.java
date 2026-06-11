package If_Else.Multiple_Conditions;

import java.util.Scanner;

public class MagnitudeOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n < 0) n = -n;
        System.out.println("Absolute value is :" + n);
        if (n < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is Bigger than 69");
        }
    }}
