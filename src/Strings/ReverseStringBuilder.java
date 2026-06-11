package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s="Deepak";
        StringBuilder sb =new StringBuilder(s);
        StringBuilder sb2=  new   StringBuilder("Alok");
      sb.deleteCharAt(5);
      sb.insert(5,'k');
      sb.delete(0,3);
        System.out.println(sb);
    }
}
