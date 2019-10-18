package ControlStatment.loop.ForLoop;

public class NextedLoopT {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            for (int j=1;j>=i;j++){
                System.out.print(" ");
            }
          for (int k=20;k>=i;k--){
              System.out.print("*");
          }
            System.out.println();
        }
    }
}
