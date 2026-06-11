package Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int result = missing(arr);
        System.out.println("Missing number = " + result);
    }
    public static int missing(int arr[]) {
        int n = arr.length + 1;   // total numbers
        int sum = n * (n + 1) / 2;  // correct formula
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }
        return sum - arrSum;
    }
}
