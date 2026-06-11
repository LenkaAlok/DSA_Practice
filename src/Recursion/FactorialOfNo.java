package Recursion;

public class FactorialOfNo {
    public static void main(String[] args) {
        System.out.println(factorila(5));
    }
    public static int factorila(int n){
        if (n==0){
            return 1;
        }
        return n*factorila(n-1);
    }
}
