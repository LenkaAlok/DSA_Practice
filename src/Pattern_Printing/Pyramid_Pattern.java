package Pattern_Printing;

import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no .of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {//line
            for(int j = 1; j <= n-i; j++){//space
                System.out.print("  ");
            }
            for (int j = 1; j<=2*i-1; j++) {//star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
