package Loops;

import java.util.*;
import java.util.stream.Collectors;

public class DoWhile {
    public static void main(String[] args) {
 List<Integer>arr=new ArrayList<>(Arrays.asList(1,6,5,6,7,8));
 int n=arr.size();
 int half=n/2;
 ArrayList<Integer>second=new ArrayList<>(arr.subList(half,n));
        ArrayList<Integer>first=new ArrayList<>(arr.subList(0,half));
 second.addAll(first);
        System.out.println(second);
    }}


