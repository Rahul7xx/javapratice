package JavaProgram;

public class CoppyAllElementArray {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,233,55,254,22,};
        int arr2 []=new int[arr1.length];
        for (int i=1;i<=arr1.length;i++) {
            arr2[i] = arr1[i];
        }
            System.out.println(" element of original element");
        for (int i=1;i<=arr1.length;i++){

            System.out.print(arr1[i] +"");


        }
        System.out.println();
        System.out.println("element of new array:");
        for (int i=1;i<=arr2.length;i++){
            System.out.println(arr2[i]+"");
        }


    }
}
