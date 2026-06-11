package Strings;

public class CountThe_Vowels_In_String {
    public static void main(String[] args) {
String s="Alok Kumar Lenka  Unique";
s.toLowerCase();
int count=0;
for (int i=0;i<s.length();i++){
    char ch=s.charAt(i);
   if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch == 'u'){
       System.out.println(ch + " ");
       count++;
   }
}
        System.out.println("Number of vowels = " + count);
    }
}
