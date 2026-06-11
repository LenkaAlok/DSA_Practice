package If_Else;

import java.util.Scanner;

public class CheckInteger {
    //take real number Input and check it is integer or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//3.145
        System.out.print("Enter a Number :");
        double n = sc.nextDouble();
        int x= (int) n;
        if (n-x == 0) {
            System.out.println("It is an integer");
        } else {
            System.out.println("It is not an integer");
        }}
}