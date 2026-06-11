package Arrays.Questions;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                int count =map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }
           for (int res: map.keySet()){
               System.out.println(res +" : "+map.get(res));
           }
    }}