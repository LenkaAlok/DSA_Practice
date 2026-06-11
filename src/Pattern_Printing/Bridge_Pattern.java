package Pattern_Printing;

import java.util.Scanner;

public class Bridge_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no .of rows");
        int n = sc.nextInt();
        for (int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for (int i = 1; i <= n-1; i++) {//line
            for (int j = 1; j <= n-i; j++) {//star
                System.out.print("* ");
            }
            for (int j = 1; j <= nsp; j++) {//space
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i; j++) {//star
                System.out.print("* ");
            }
            nsp=nsp+2;
            System.out.println();
        }
    }
}