package ControlStatementIfStatement;

public class IfElseIf {
    public static void main(String[] args) {
        int num=123;
        if (num<10&&num>1){
            System.out.println("num is one digits");
        }
        else if (num<100&&num>10){
            System.out.println("num is two digits");
        }
        else if (num<200&&num>10){
            System.out.println("num is three digits");
        }

    }
}
