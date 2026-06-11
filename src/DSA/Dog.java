package DSA;

public class Dog extends Animal{
    public void eat(){
        System.out.println("Dog like to Eat met..");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.sleep();
    }
}
