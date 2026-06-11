package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s="Alok Kumar Lenka";
        String s2="d";
        String s3="A";
        System.out.println(s.indexOf('k'));// It prefer 1 st char//5
        System.out.println(s.lastIndexOf('k'));//14
        System.out.println(s.lastIndexOf('y'));//-1 because the index or char is not present
        System.out.println(s.toLowerCase());//alok kumar lenka
        System.out.println(s.toUpperCase());//ALOK KUMAR LENKA
        System.out.println(s.contains("Alok"));//true
        if(s.contains("Kumar")){
            System.out.println("It is Right");
        }
        System.out.println(s.startsWith("A"));//true
        System.out.println(s.startsWith("al"));//false
        System.out.println(s.endsWith("Lenka"));//true
        System.out.println(s2.compareTo(s3));

    }
}
