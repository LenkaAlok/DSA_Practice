package Methods;

public class Return_Type {
    public static int alok(){
        System.out.println("Hello alok...");
        return 5;
    }
    public static void main(String[] args) {
        alok();
        int x=alok();
        System.out.println(x);
    }
}
