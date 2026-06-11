package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        int n=al.size();
        al.add(25);
        al.add(21);
        al.add(18);
        al.add(5);
        al.add(10);
        System.out.println(al.get(2));
        al.set(3,50);
        System.out.println(al.get(3));
        System.out.println(al);

        al.remove(al.size()-1);//last index
        System.out.println(al);
        Collections.reverse(al);//[50, 18, 21, 25]
        System.out.println(al);

    }
}
