package Basic_Sorting;

public class SquareRoot {
    public static void main(String[] args) {

        int n = 10;   // number whose square root we want

        int low = 1;  // starting point of search range
        int high = n; // ending point of search range

        int ans = 0;  // variable to store the floor square root

        // binary search loop
        while(low <= high){

            int mid = (low + high) / 2;  // find middle value

            // check if perfect square
            if(mid * mid == n){
                ans = mid;   // exact square root
                break;       // stop loop
            }

            // if square is smaller than n
            else if(mid * mid < n){
                ans = mid;        // store possible answer
                low = mid + 1;    // search right side
            }

            // if square is larger than n
            else{
                high = mid - 1;   // search left side
            }
        }

        // print the result
        System.out.println("Floor square root = " + ans);
    }
}
