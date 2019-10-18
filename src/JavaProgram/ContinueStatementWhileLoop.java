package JavaProgram;

import ControlStatment.loop.WhileLoop;

public class ContinueStatementWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            if (i == 9) {
                i++;
                continue;
            }
        System.out.println(i);
        i++;

    }
}
}
