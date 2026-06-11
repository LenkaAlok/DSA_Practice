package Basic_Sorting;

public class ReverseArrayUsing_BubbleSort {
    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 1, 3, 2};
        int n = arr.length;
        print(arr);
        //bubble sort optimised
        for (int i = 0; i < n - 1; i++) {//n-1 passes means round
            int swaps=0;
            for (int j = 0; j < n- 1- i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps==0)break;;
        }
        print(arr);
    }
}
