package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    static  int pairSum(int arr[],int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array"+ n +"elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
            System.out.println("Enter target sum");
             int target=sc.nextInt();
            System.out.println(pairSum(arr,target));
    }
}
