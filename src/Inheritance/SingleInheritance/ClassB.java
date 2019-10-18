package Inheritance.SingleInheritance;

public class ClassB extends ClassA {
    public void methodB()
    {
        System.out.println("Child class method");

    }

    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.methdA();
        obj.methodB();
    }
}
