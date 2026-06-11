package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloAlok {
    public static void main(String[] args) {
        //List<String> data= Arrays.asList("Alok","Mike","Deepak");

        List<Integer> data= Arrays.asList(10,21,33,40,50);
        data.stream().forEach(x-> System.out.println(x));
        //System.out.println(res);
    }
}