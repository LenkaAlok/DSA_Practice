package MultiDimentionalArrays;

import java.util.Scanner;

public class outputIn2D_Array {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6}
//        };
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
              arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
