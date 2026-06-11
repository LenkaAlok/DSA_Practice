package Recursion;

public class PrintAllNaturalNumber {
    public static void main(String[] args) {

        naturalNumber(10);
    }

    public static void naturalNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        naturalNumber(n - 1);
        System.out.println(n);
    }
}