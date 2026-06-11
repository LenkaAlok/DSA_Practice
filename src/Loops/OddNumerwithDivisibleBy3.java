package Loops;

public class OddNumerwithDivisibleBy3 {
    //print all odd number divisible by 3 from 1 to 100
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
