package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int  [][]a={{12,20},{20,30,30},{20,3,69}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+",");


            }
            System.out.println();
        }
    }

}