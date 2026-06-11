package Basic_Sorting;

public class BinaerSearch {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public  static int search(int[] arr, int target) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,7};
        print(arr);
        System.out.println("The element present index is : ");
        int res=search(arr,5);
        System.out.println(res);
    }
}
