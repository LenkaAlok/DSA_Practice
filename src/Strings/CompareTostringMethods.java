package Strings;

public class CompareTostringMethods {
    public static void main(String[] args) {
        String a="Alok ";
        String b="Kumar";
       a.concat(b);     //no concate
        System.out.println(a);    //print Alok
        System.out.println(a.concat(b));
        a=a+"Hii How are you...";      //It create new string internally
        a=a+10;
        a=a+'\n';
        a=a+'n';
        System.out.println(a);
        System.out.println("Alok"+10+20);
        System.out.println(10+"Alok"+20);
        System.out.println('A'+2+"Deepak");
    }
}
