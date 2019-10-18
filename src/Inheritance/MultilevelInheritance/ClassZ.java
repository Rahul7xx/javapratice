package Inheritance.MultilevelInheritance;

public class ClassZ extends ClassY{
    public void methodz(){
        System.out.println("Class z mathod");
    }

    public static void main(String[] args) {
        ClassZ obj = new ClassZ();
        obj.methodx();
        obj.methody();
        obj.methodz();
    }
}
