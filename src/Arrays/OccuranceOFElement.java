package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOFElement {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,2,3,5,6,7};
        Map<Integer,Integer>map=new HashMap<>();
        for (int num: arr){
            if(map.containsKey(num)){
                int count =map.get(num);
                map.put(num,count+1);
            }else {
                map.put(num,1);
            }
        }
        for(int res : map.keySet()){
            System.out.println(res +" : "+map.get(res));
        }

    }
}
