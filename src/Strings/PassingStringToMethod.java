package Strings;

public class PassingStringToMethod {
    public static void change(String x){
        x="Alok";//it is been pass by value
    }
    public static void main(String[] args) {
        String x="alok";
        System.out.println(x);
        x="Deepak";
        change(x);
        System.out.println(x);
    }
}
