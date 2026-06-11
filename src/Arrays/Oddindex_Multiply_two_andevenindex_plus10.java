package Arrays;

import java.util.Arrays;

public class Oddindex_Multiply_two_andevenindex_plus10 {
    public static void main(String[] args) {
        //sort->ascending order
        int[] arr = {4, 1, 5, 7, -3, 10, 2};
        print(arr);
        for (int i=0;i<arr.length;i++){
           if (i%2!=0) arr[i]*=2;
           else arr[i]+=10;
        }
        print(arr);
    }
    public static void print(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    }
