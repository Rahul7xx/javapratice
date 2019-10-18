package Operator;

public class AssignmentOperator {
    public static void main(String[] args) {
       int num1 = 20;
        int num2  = 50;
        num1=num2;
        System.out.println("=output:"+num2);
        num1+=num2;
        System.out.println("+=output:"+num2);
        num1-=num2;
        System.out.println("-=output:"+num2);
        num1*=num2;
        System.out.println("*=output:"+num2);
        num1/=num2;
        System.out.println("/=output:"+num2);
        num1%=num2;
        System.out.println("%=output:"+num2);

    }
}
