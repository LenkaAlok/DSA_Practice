package MapInterface;

import java.util.HashMap;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                System.out.println(num);
            }
            map.put(num, 1);
        }
    }
}