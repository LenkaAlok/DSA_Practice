package Methods;

public class MainMethod {
    public static void  alok(){
        anita();
        System.out.println("Hii Alok...");
    }
    public static void main(String[] args) {
       deepak();
        System.out.println("Hii main....");
    }
    public static void anita(){
        System.out.println("Hii Anita....");
    }
    public static void deepak(){
        anita();
        alok();
        System.out.println("Hii deepak...");
        alok();
    }
}
