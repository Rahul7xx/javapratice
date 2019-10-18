package Constructor;

public class Employee {
    String name;
    int imp_id;
    Employee(String name,int imp_id)
    {
        this.name=name;
        this.imp_id=imp_id;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("rahul",101);
        Employee e2=new Employee("mukesh",102);
        System.out.println("Employee 1: "+e1.name+"  "+e1.imp_id);
        System.out.println("Employee 2: "+e2.name+"  "+e2.imp_id);

    }
}
