package Arrays;

public class Segregate_0S_1S {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,1,0,1,1,0};
    int zeros=0;
    int ones=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                zeros++;
            else ones ++;
            }
        for(int i = 0; i < zeros; i++){
            arr[i]=0;
            }
        for(int i = zeros; i <arr.length; i++){
            arr[i]=1;
        }
        for (int ele : arr) {
        System.out.print( ele+" ");
    }
}}
