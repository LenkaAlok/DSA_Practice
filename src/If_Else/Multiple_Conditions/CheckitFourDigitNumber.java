package If_Else.Multiple_Conditions;

import java.util.Scanner;

public class CheckitFourDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int  n=sc.nextInt();
        if (n > 999 &&  n<= 9999){
            System.out.println("It is 4 digit Number");
        }else{
            System.out.println("It is  not 4 digit");
        }
    }
}
