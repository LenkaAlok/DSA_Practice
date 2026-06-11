package collections;

import java.util.ArrayList;

public class ReverseArrayListElement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=al.size();
        al.add(25);
        al.add(21);
        al.add(18);
        al.add(5);
        al.add(10);
        System.out.println(al);
        int i=0,j=al.size()-1;
        while(i<j){
            int temp=al.get(i);
            al.set(i,al.get(j));
            al.set(j,temp);
            i++;
            j--;

        }
        System.out.println(al+ " ");
    }
}
