package Arrays;

public class Second_Max_Element {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,7,5,6};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        //calculate max
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
            }}
            //second max
            for (int i=0;i<arr.length;i++){
                if(arr[i]> smax  && arr[i]!=max){
                    smax=arr[i];
            }}
                System.out.println("Largest element of an array :"+max);
                System.out.println(" Second Largest element of an array :"+smax);

        
    }
}
