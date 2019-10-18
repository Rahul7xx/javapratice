package ControlStatment.IfStatement;

public class NestedIf {
    public static void main(String[] args) {
        int num=70;
        if(num<100){
            System.out.println("num less then 100");
            if(num<50){
                System.out.println("num less then 70");
                if(num>10){
                    System.out.println("num is greater then 10");
                }
            }
        }
    }
}
