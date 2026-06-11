package Basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class A  {
    public static void main(String[] args) {
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    int arr[]={1,3,4,5,2};
  int target=7;
  int count=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count ++;
                }
            }
        }
        System.out.println("target of sum pair :"+count);
    }

}