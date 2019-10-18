package Polymorphism.OverLoding.Overrding;

public class ClassB extends ClassA {
    public void show()
    {
        System.out.println("I am in ClassB");
    }

    public static void main(String[] args) {
        ClassB b=new ClassB();
        b.show();
    }
}
