package Basic_Sorting;

public class Selection_Sort_FindLarge_First {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,1,3,2};
        int n = arr.length;
print(arr);
        for(int i = n - 1; i > 0; i--) {

            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            for(int j = 0; j <= i; j++) {

                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            // swap max with last unsorted index
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        print(arr);

    }
}
