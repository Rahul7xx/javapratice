package ControlStatment.Switchstatement;

public class SwitchCase {
    public static void main(String[] args) {
        int num=1000000;
        switch(num+10){
            case 1:
                System.out.println("value"  +num);
            case 2:
                System.out.println("value"  +num);
            case 3:
                System.out.println("value"  +num);
            case 4:
                System.out.println("value"  +num);
            default:
                System.out.println("this value default       "  +  num);
        }
    }
}
