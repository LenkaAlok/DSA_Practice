package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        int cp=sc.nextInt();
        System.out.println("Enter Selling price");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit : "+(sp-cp));
        }else if (sp==cp) {
            System.out.println("No profit no loss: "+(cp-sp));
        }else{
            System.out.println("Loss");
        }
    }
}
