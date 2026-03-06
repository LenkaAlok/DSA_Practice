package Basic_Sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int n = sc.nextInt();
//        System.out.println("Enter the array elements");
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
       String s1="Madam";
       String s2="";
       for (int i=s1.length()-1;i>=0;i--){
           s2=s2+s1.charAt(i);
       }
      //  System.out.println(s2.compareToIgnoreCase(s1));
       if(s2.equalsIgnoreCase(s1)){
           System.out.println("Palindrom a String");
       }else{
           System.out.println("Not palindrom");
       }
    }
    }
