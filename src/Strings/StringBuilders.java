package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Alok");
        System.out.println(sb.length()+" "+ sb.capacity());
        sb.setCharAt(1,'o');
        System.out.println(sb);
String t=sb.toString();
        System.out.println(t);
    }
}
