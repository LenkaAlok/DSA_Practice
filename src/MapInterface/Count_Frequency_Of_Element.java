package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Of_Element {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4,5,0};
        Map<Integer,Integer> map=new HashMap<>();

        for (int res : arr){
            System.out.print(res+" ");
            if (map.containsKey(res)){
                map.put(res,map.get(res)+1);
            }else{
                map.put(res,1);
            }

        }
        System.out.println();
        System.out.println(map);

    }
}
