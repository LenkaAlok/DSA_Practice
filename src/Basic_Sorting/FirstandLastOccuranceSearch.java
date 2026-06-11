package Basic_Sorting;
import java.util.ArrayList;
public class FirstandLastOccuranceSearch {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static ArrayList<Integer> find(int arr[], int x) {

        ArrayList<Integer> result = new ArrayList<>();

        int  index =-1;

        int low = 0;
        int high = arr.length - 1;

        // Find First Occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                index=mid;
                high = mid - 1;   // go left
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        result.add(index);
        low = 0;
        high = arr.length - 1;
        index=-1;

        // Find Last Occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                index = mid;
                low = mid + 1;   // go right
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }


        result.add(index);

        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,7};
        print(arr);
        find(arr,2);
       

    }
    }

