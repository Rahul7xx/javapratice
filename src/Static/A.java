package Static;

public class A {
    int eid;
    int salary;
   static String ceo;
    static {
        ceo="pooja";
    }
    public A()
    {
        eid=1;
        salary=20202020;


    }
    public void show()
    {
        System.out.println(eid+":"+salary+":"+ceo);

    }
}
