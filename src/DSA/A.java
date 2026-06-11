package DSA;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Methods.Permutationand_Combination.fact;
import static java.util.Arrays.stream;
import java.util.Collections;

public class A {
    public static void main(String[] args) {
      String s="banana";
      HashMap<Character,Integer>map=new HashMap<>();
      for (int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if (map.containsKey(ch)){
              int count=0;
              map.put(ch,count+1);
          }else {
              map.put(ch,1);
          }
      }
        System.out.println(map);
    }
}
