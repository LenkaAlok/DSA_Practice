package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Basics {
    public static void main(String[] args) {
        Map<Integer,String>map= new HashMap<>() ;
        map.put(1,"Alok");
        map.put(2,"Deepak");
        map.put(3,"Anita");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.remove(2));
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Alok"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        // Traversing Map
        for(Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        //using entryset()
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
        map.clear();
        System.out.println(map);
    }
    }
