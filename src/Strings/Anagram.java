package Strings;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s1="race";
        String s2="car";
     boolean res=   isAnagram(s1,s2);
        System.out.println(res);

    }
}
