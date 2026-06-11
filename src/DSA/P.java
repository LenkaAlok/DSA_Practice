package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P {
    public static void main(String[] args) {
     int arr[]={1,5,7,2,3,9};
     int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int res: arr){
            System.out.println(res);
        }
    }
}
