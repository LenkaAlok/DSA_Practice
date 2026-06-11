package If_Else.Multiple_Conditions;

import java.util.Scanner;

public class SidesOfaTriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st  side");
        int a = sc.nextInt();
        System.out.println("Enter 2nd  side");
        int b= sc.nextInt();
        System.out.println("Enter 3rd side");
        int c= sc.nextInt();
        if (a+b>c && b+c>a && c+a >b)
            System.out.println("Valid Triangle sides");
        else System.out.println("Invalid Triangel4");
    }
}
