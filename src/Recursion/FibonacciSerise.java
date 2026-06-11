package Recursion;

public class FibonacciSerise {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
if(n==0 || n==1){//base case
    return n;
}
//sub problems
return fibonacci(n-1)+fibonacci(n-2);
    }
}