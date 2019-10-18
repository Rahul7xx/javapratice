public class IdName {

        int  id;
        int  ph ;
        IdName(){
            id = 10;
            ph = 20;
            System.out.println("Inside Constructor");
        }

        public void display(){
            System.out.println("Value1 === "+10);
            System.out.println("Value2 === "+454);
            System.out.println("Value3 === "+888);
            System.out.println("Value4 === "+888);
            System.out.println("Value5 === "+585);
            System.out.println("Value6 === "+55777);
            System.out.println("Value7 === "+6555);
        }

        public static void main(String args[]){
            IdName d1 = new IdName();
            d1.display();
        }
    }