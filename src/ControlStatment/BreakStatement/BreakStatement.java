package ControlStatment.BreakStatement;

public class BreakStatement {
        public static void main(String[] args){
            int num =0;
            while(num<=100)
            {
                System.out.println("Value of variable is: "+num);
                if (num==12)
                {
                    break;
                }
                num++;
            }
            System.out.println("Out of while-loop");
        }
    }
