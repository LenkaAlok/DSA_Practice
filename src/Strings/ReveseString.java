package Strings;

public class ReveseString {
    public static void main(String[] args) {
        String s="Deepak";
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}
