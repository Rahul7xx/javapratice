package Polymorphism.OverLoding;

public class ClassB extends ClassA {
    public void show(int a)
    {
        System.out.println("I am in ClassB");

    }

    public static void main(String[] args) {
        ClassB  b=new ClassB();
                b.show();
    }
}
