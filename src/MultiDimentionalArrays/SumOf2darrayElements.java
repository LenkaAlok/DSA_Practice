package MultiDimentionalArrays;

import java.util.Scanner;

public class SumOf2darrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        int sum=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[1].length;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
            System.out.println(sum);

    }
}
