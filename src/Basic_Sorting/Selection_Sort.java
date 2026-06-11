package Basic_Sorting;

public class Selection_Sort {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,1,3,2};
        int n=arr.length;
        print(arr);
        for(int i = 0; i < n - 1; i++) {//n-1 passes
            int min=Integer.MAX_VALUE;
            int mindex = -1;//
            for(int j = i; j < n; j++) {
                if(arr[j] < min) {//
                   min=arr[j];
                   mindex=j;
                }
            }
            int temp = arr[i];//
            arr[i] = arr[mindex];//
            arr[mindex] = temp;
        }
        print(arr);

    }
}
