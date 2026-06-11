package collections;

import java.util.Collections;
import java.util.Vector;
public class AddOne {
    static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;   // because we add +1
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else {
                ans.add(0);
                carry = 1;
            }
        }
        // if carry remains
        if(carry == 1) {
            ans.add(1);
        }
        // reverse because inserted from end
        Collections.reverse(ans);

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8};
        Vector<Integer> result = addOne(arr);
        System.out.println(result);
    }
}
