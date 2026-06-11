package MultiDimentionalArrays;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[1].length;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        int maxSum=0;
        int row =-1;
        for (int i=0;i< arr.length;i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                row=i;
            }
        }
        System.out.println("row-"+row+" sum  "+maxSum);

    }
}
