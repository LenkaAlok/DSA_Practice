package Pattern_Printing;

import java.util.Scanner;

//1 1 1 1
//2 2 2 2
//3 3 3 3
//4 4 4 4
public class PrintRow_1_all_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no .of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
