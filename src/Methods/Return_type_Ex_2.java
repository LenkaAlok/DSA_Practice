package Methods;

public class Return_type_Ex_2 {
    public static int max(int a,int b,int c){
        if(a>=b && a>=c) return a;
        else if(b>=a  && b>=c ) return b;
        else return c;
    }
    public static void main(String[] args) {
        int x= max(5,7,9);
        System.out.println(x);
        System.out.println(max(9,11,15));
    }
}
