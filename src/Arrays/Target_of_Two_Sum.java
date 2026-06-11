package Arrays;

public class Target_of_Two_Sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,7,5,6};
        int target=12;
        int count=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count ++;
                }
        }
    }
        System.out.println("target of sum pair :"+count);
}}
